package com.services.impl;

import com.repositories.EmployeesRepository;
import com.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "employees")
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeesRepository employeesRepository;

	@Autowired
	EmployeeServiceImpl (EmployeesRepository employeesRepository) {
		this.employeesRepository = employeesRepository;
	}
}
