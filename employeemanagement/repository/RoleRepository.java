package com.greatlearning.employeemanagement.repository;
//4567890
import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
