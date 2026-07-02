package com.app;

import com.app.entity.*;
import com.app.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HqlNativeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(HqlNativeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HqlNativeApplication.class, args);
    }

    @Bean
    public CommandLineRunner runDemo(EmployeeRepository empRepo, DepartmentRepository deptRepo) {
        return args -> {
            LOGGER.info("\n PREPPING DATA ");
            Department tech = new Department("Technology");
            Employee e1 = new Employee("Alice", 85000.0, tech);
            Employee e2 = new Employee("Bob", 65000.0, tech);
            Employee e3 = new Employee("Charlie", 95000.0, tech);
            tech.setEmployees(List.of(e1, e2, e3));
            deptRepo.save(tech);

            LOGGER.info("\n 1. HQL Basic Query ");
            List<Employee> hqlResult = empRepo.searchByNameHql("li");
            LOGGER.info("Employees with 'li' in name:");
            hqlResult.forEach(e -> LOGGER.info(" - {}", e.getName()));

            LOGGER.info("\n 2. HQL Aggregate Function ");
            Double avgSalary = empRepo.getAverageSalary();
            LOGGER.info("Average Company Salary: ${}", avgSalary);

            LOGGER.info("\n 3. Native SQL Query ");
            List<Employee> highEarners = empRepo.findHighEarnersNative(80000.0);
            LOGGER.info("Employees earning over $80,000:");
            highEarners.forEach(e -> LOGGER.info(" - {} (${})", e.getName(), e.getSalary()));

            LOGGER.info("\n 4. HQL JOIN FETCH ");
            Department fetchedDept = deptRepo.findByNameWithEmployeesHql("Technology");
            LOGGER.info("Fetched Department '{}' along with {} employees in one query!", 
                fetchedDept.getName(), fetchedDept.getEmployees().size());
        };
    }
}