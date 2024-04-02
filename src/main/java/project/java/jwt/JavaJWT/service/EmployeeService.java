package project.java.jwt.JavaJWT.service;

import project.java.jwt.JavaJWT.model.Employee;

import java.util.List;

public interface EmployeeService {


    //save an employee

   public void addEmployee (Employee employee);


    // get employees
    public List<Employee> getAllEmployees();
    // get one employee

    public Employee findById(Integer id);

    //update employee
   public void updateEmployee(Employee employee);

    //delete employee
    Boolean deleteById(Integer id);

}


