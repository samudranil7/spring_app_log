package com.example.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrest.entity.CustomerLog;

public interface LogDao extends JpaRepository<CustomerLog,String>
{
	List<CustomerLog> findBydate(String date);
}
