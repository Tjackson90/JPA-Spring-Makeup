package wccipt.com.JPAMakeupProject.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
public class Project {
    
    @OneToMany
    private EmployeeProject employeeProject;

    private Long projectId;
    private String projectName;

    public EmployeeProject getEmployeeProject() {
        return employeeProject;
    }
}