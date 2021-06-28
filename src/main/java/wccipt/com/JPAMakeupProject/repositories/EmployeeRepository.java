package wccipt.com.JPAMakeupProject.repositories;

import org.springframework.data.repository.CrudRepository;
import wccipt.com.JPAMakeupProject.models.Employee;

import java.util.Collection;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findById(long id);

    Collection<Employee> findEmployee(String firstName, String middleName, String lastName, String Suffix);
}

