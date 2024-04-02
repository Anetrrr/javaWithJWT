package project.java.jwt.JavaJWT.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.java.jwt.JavaJWT.model.Employee;
import project.java.jwt.JavaJWT.repository.InMemoryEmployeeRepository;
import project.java.jwt.JavaJWT.service.EmployeeService;

import java.util.List;

@RequiredArgsConstructor
@Data
@Service

public class InMemoryEmployeeServiceImpl implements EmployeeService {

    public final InMemoryEmployeeRepository inMemoryEmployeeRepository;


    @Override
    public void addEmployee(Employee employee) {
        inMemoryEmployeeRepository.addEmployee(employee);

    }
    @Override
    public List<Employee> getAllEmployees() {
        return inMemoryEmployeeRepository.getAllEmployees();
    }
    @Override
    public Employee findById(Integer id) {
        return inMemoryEmployeeRepository.findById(id);
    }
    @Override
    public void updateEmployee(Employee employee) {
        inMemoryEmployeeRepository.addEmployee(employee);

    }
    @Override
    public Boolean deleteById(Integer id) {
        return inMemoryEmployeeRepository.deleteById(id);
    }
}
