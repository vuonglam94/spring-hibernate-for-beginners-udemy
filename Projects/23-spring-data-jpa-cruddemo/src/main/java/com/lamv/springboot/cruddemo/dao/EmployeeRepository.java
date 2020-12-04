package com.lamv.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lamv.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
