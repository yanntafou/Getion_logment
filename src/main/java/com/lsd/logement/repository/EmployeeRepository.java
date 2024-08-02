package com.lsd.logement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsd.logement.entity.personnel.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}