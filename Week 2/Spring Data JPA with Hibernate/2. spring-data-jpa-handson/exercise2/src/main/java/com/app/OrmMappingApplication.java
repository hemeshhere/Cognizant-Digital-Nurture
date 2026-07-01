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
import java.util.Set;

@SpringBootApplication
public class OrmMappingApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmMappingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrmMappingApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(DepartmentRepository deptRepo, StudentRepository studentRepo) {
        return (args) -> {
            LOGGER.info(" 1. Testing One-To-Many / Many-To-One ");
            Department engineering = new Department("Engineering");
            
            Employee e1 = new Employee("Alice", engineering);
            Employee e2 = new Employee("Bob", engineering);
            engineering.setEmployees(List.of(e1, e2));
            
            deptRepo.save(engineering); 
            Department savedDept = deptRepo.findById(1L).get();
            LOGGER.info("Department loaded: {} with {} employees.", savedDept.getName(), savedDept.getEmployees().size());


            LOGGER.info("\n 2. Testing Many-To-Many ");
            Course java = new Course("Java 101");
            Course spring = new Course("Spring Boot Mastery");
            Student student = new Student("Charlie", Set.of(java, spring));
            
            studentRepo.save(student);
            
            Student savedStudent = studentRepo.findById(1L).get();
            LOGGER.info("Student loaded: {} is taking {} courses.", savedStudent.getName());
        };
    }
}