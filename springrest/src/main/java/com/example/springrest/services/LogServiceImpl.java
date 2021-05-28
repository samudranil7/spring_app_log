package com.example.springrest.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrest.dao.LogDao;
import com.example.springrest.entity.CustomerLog;

@Service
public class LogServiceImpl implements LogService 
{
	@Autowired
	private LogDao ele;
	
	@Override
	public List<CustomerLog> getLogs() 
	{
		return this.ele.findAll();
	}

	@Override
	public void addLog(String name) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String s = dtf.format(now).toString();  
		String arr[] = s.split(" ");
		String date = arr[0];
		String time = arr[1];
		String id = name+time;
		CustomerLog cl = new CustomerLog(id,name,"IN",date,time);
		ele.save(cl);
	}

	@Override
	public void addLogOut(String name) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		String s = dtf.format(now).toString();  
		String arr[] = s.split(" ");
		String date = arr[0];
		String time = arr[1];
		String id = name+time;
		CustomerLog cl = new CustomerLog(id,name,"OUT",date,time);
		ele.save(cl);
		
	}

	@Override
	public List<CustomerLog> getLogsByDate(String date) 
	{
		return ele.findBydate(date);
	}
}
