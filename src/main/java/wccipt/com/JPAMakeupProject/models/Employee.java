package wccipt.com.JPAMakeupProject.models;


import wccipt.com.JPAMakeupProject.models.Address;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
   
    @OneToOne
    private Collection<Address> addresses;
    @OneToMany
    private Collection<EmployeeProject> employeeProject;


    public Employee(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public Collection<Address> getAddress(){
        return addresses;
    }

    public Collection<EmployeeProject> getEmployeeProject(){
        return employeeProject;
    }

    protected Employee() {

    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }
    
}

