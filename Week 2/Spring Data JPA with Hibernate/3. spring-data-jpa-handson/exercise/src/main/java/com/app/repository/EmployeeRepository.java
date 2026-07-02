package com.app.repository;

import com.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.name LIKE %:keyword%")
    List<Employee> searchByNameHql(@Param("keyword") String keyword);

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAverageSalary();

    @Query(value = "SELECT * FROM employee WHERE salary > ?1", nativeQuery = true)
    List<Employee> findHighEarnersNative(Double threshold);
}