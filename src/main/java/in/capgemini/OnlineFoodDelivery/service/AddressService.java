package in.capgemini.OnlineFoodDelivery.service;

import in.capgemini.OnlineFoodDelivery.domain.Address;

public interface AddressService {

	public Address saveorUpdate(Address address);
	
	public Address findAddressById(Long addressId);
	
	public Iterable<Address> finaAllAddress();
	
	public void deleteAddressByAddressId(Long addressId);
}

