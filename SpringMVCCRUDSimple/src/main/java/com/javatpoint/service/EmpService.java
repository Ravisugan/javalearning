package com.javatpoint.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javatpoint.beans.Emp;
import com.javatpoint.dao.EmpDao;
@Service
public class EmpService {
	@Autowired
	EmpDao empDao;

	public int save(Emp p){  
		
		return empDao.save(p);
	  
	}  
	public int update(Emp p){  
	    return empDao.update(p);
	    }  
	public int delete(int id){  
		return empDao.delete(id);
	    
	}  
	public Emp getEmpById(int id){ 
		
		return empDao.getEmpById(id);
	   
	}  
	public List<Emp> getEmployees(){  
		return empDao.getEmployees();
	  
	   
	}  

}
