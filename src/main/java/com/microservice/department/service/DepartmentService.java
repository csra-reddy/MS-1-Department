package com.microservice.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.department.entity.Department;
import com.microservice.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id).orElse(null);
	}

}
