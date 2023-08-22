package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.Employeerepo;

@Service
public class Employeeservice
{
  @Autowired
  Employeerepo sr;
  public EmployeeModel saveinfo(EmployeeModel ss)
	{
		return  sr.save(ss);
	}
	
	public List<EmployeeModel> showinfo()//get
	{
		return sr.findAll();
	}
	public Optional <EmployeeModel> getemployeebyid(int id)
	{
		return sr.findById(id);
	}
	
}
