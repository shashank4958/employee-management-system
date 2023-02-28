
// interface used to extend jpa repository
	// used to connect database with entity class

package com.project72.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project72.employee.entity.EmployeeEntity;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
	

}
