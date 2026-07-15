package com.cognizant.EmployeeManagement;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:4200") 
public class EmployeeController {

    private final ApplicationContext context;

    public EmployeeController() {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        @SuppressWarnings("unchecked")
        List<Employee> employees = (List<Employee>) context.getBean("employeeList");
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        @SuppressWarnings("unchecked")
        List<Employee> employees = (List<Employee>) context.getBean("employeeList");
        
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }
}