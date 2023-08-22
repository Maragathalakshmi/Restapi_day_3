package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModel;
import com.example.demo.service.Employeeservice;

@RestController
public class EmployeeController 
{
     @Autowired
     Employeeservice sser;
     @PostMapping("/")
     public boolean adddetails(@RequestBody EmployeeModel ss)
     {
    	 
          return sser.saveinfo(ss)!=null;
     } 
     @GetMapping("/")
     public List<EmployeeModel> show()
     {
     	return sser.showinfo();
     }
     @GetMapping("/{id}")
     public Optional<EmployeeModel> oneemployee(@PathVariable int id)
     {
     	return sser.getemployeebyid(id);  
     } 
     @GetMapping("getid")
     public Optional<EmployeeModel> oneemp(@RequestParam int id)
     {
    	 return sser.getemployeebyid(id);
     }
    
//    
}
