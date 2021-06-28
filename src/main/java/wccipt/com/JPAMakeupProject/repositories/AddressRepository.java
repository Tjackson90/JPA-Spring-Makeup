package wccipt.com.JPAMakeupProject.repositories;

import org.springframework.data.repository.CrudRepository;
import wccipt.com.JPAMakeupProject.models.Address;

public interface AddressRepository extends CrudRepository<Address, String>{
    
    Address findAddressById (String id);
}
