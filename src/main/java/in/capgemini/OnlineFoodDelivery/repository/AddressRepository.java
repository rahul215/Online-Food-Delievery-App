package in.capgemini.OnlineFoodDelivery.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.capgemini.OnlineFoodDelivery.domain.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Long>{
Address findByAddressId(Long addressId);
	

	Iterable<Address> findAll();

}