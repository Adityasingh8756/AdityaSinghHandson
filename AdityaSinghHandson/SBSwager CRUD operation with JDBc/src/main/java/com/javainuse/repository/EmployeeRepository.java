package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
