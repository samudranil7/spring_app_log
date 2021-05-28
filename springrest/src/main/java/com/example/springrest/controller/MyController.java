package com.example.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrest.entity.CustomerLog;
import com.example.springrest.services.LogService;

@RestController
public class MyController 
{
	@Autowired
	private LogService lserv;
	
	@GetMapping("/getAllLog")
	public List<CustomerLog> getAllLog()
	{
		return this.lserv.getLogs();
	}
	
	@GetMapping("/getLog")
	public List<CustomerLog> getLog(@RequestParam(name="date", required = true, defaultValue = "No") String date)
	{
		return this.lserv.getLogsByDate(date);
	}
	@GetMapping("/checkIn")
	public String checkIn(@RequestParam(name="name", required = true, defaultValue = "No") String name)
	{
		this.lserv.addLog(name);
		return "True";
	}
	
	@GetMapping("/checkOut")
	public String checkOut(@RequestParam(name="name", required = true, defaultValue = "No") String name)
	{
		this.lserv.addLogOut(name);
		return "True";
	}
}
