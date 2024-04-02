package project.java.jwt.JavaJWT.resource;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.java.jwt.JavaJWT.model.Employee;
import project.java.jwt.JavaJWT.service.EmployeeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeResource {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees (){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping
    public ResponseEntity<Employee> getEmployeebyId (@PathVariable("id") Integer id){
        return ResponseEntity.ok(employeeService.findById(id);
    }
}
