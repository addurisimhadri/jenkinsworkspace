package com.sim.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sim.bean.EmployeeBean;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/getemployee")
	public List<EmployeeBean>getEmployee() {
		ArrayList<EmployeeBean> employeeBeans=new ArrayList<EmployeeBean>();
		
		EmployeeBean employeeBean=new EmployeeBean();
		//employeeBean.s
		
		EmployeeBean employeeBean1=new EmployeeBean();
		
		
		employeeBeans.add(employeeBean);
		employeeBeans.add(employeeBean1);

		
		return employeeBeans;
	}

}
