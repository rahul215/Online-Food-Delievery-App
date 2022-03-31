package in.capgemini.OnlineFoodDelivery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.capgemini.OnlineFoodDelivery.domain.Customer;

@Repository 
public interface CustomerRepository extends CrudRepository<Customer, Long>{

	
	
	
      Customer findByMobileNumber(String mobileNumber);
	

	  Iterable<Customer> findAll();
}
