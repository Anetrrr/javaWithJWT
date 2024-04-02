package project.java.jwt.JavaJWT.repository;

import org.springframework.stereotype.Repository;
import project.java.jwt.JavaJWT.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryEmployeeRepository {

    private static final List<Employee> DATABASE = new ArrayList<>();

    static {
        DATABASE.add(new Employee(1, "Long", "John", "lj@gmail.com"));
        DATABASE.add(new Employee(2, "Hiroshima", "Japan", "hj@gmail.com"));
        DATABASE.add(new Employee(3, "St", "Ives", "siv@gmail.com"));
        DATABASE.add(new Employee(4, "Rexton", "Shaw", "rs@gmail.com"));
        DATABASE.add(new Employee(5, "Fulham", "Lucas", "fl@gmail.com"));
        DATABASE.add(new Employee(6, "VanHess", "VreenHill", "vv@gmail.com"));
    }

    //save an employee

    public Employee addEmployee (Employee employee){
        DATABASE.add(employee);
        return employee;
    }

    public List<Employee> getAllEmployees() {

     return List.copyOf(DATABASE);
    }
    // get one employee

    public Employee findById(Integer id){
        return DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();
    }

    //update employee
   public String updateEmployee(Employee employee) {

        if (DATABASE.contains(employee)) {

            return null;


        }


    }

    //delete employee
    public Boolean deleteById(Integer id){

        Employee employee =  DATABASE
                .stream()
                .filter(emp -> id.equals(emp.getId()))
                .findFirst()
                .orElseThrow();

        DATABASE.remove(employee);
       return true;

    }



}
