package in.capgemini.OnlineFoodDelivery.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.capgemini.OnlineFoodDelivery.domain.Address;
import in.capgemini.OnlineFoodDelivery.repository.AddressRepository;
import in.capgemini.OnlineFoodDelivery.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveorUpdate(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address findAddressById(Long addressId) {
		Address address=addressRepository.findByAddressId(addressId);
		return address;
	}

	@Override
	public Iterable<Address> finaAllAddress() {
		return addressRepository.findAll();
	}

	@Override
	public void deleteAddressByAddressId(Long addressId) {
		Address address=addressRepository.findByAddressId(addressId);
           addressRepository.delete(address);	
	}

}