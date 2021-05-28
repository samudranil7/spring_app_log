package com.example.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springrest.entity.CustomerLog;

@Service
public interface LogService 
{
	public List<CustomerLog> getLogs();
	public void addLog(String name);
	public void addLogOut(String name);
	public List<CustomerLog> getLogsByDate(String date);
}
