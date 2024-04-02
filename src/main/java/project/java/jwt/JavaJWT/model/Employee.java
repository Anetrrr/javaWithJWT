package project.java.jwt.JavaJWT.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee_table")
public class Employee {

    @Id
    public Integer id;

    public String firstName;
    public String lastName;
    public String email;



}
