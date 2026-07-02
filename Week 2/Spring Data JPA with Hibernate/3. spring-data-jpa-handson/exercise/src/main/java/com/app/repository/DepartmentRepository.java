package com.app.repository;

import com.app.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d FROM Department d JOIN FETCH d.employees WHERE d.name = :deptName")
    Department findByNameWithEmployeesHql(@Param("deptName") String deptName);
}