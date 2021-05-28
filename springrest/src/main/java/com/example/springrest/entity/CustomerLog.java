package com.example.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerLog 
{
	@Id
	private String id;
	private String name;
	private String logType;
	private String date;
	private String time;
	@Override
	public String toString() {
		return "CustomerLog [id=" + id + ", name=" + name + ", logType=" + logType + ", date=" + date + ", time=" + time
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public CustomerLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerLog(String id, String name, String logType, String date, String time) {
		super();
		this.id = id;
		this.name = name;
		this.logType = logType;
		this.date = date;
		this.time = time;
	}
	
	
}
