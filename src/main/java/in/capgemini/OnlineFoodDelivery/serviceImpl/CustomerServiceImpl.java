package in.capgemini.OnlineFoodDelivery.serviceImpl;


import in.capgemini.OnlineFoodDelivery.domain.Customer;
import in.capgemini.OnlineFoodDelivery.exception.CustomerIdException;
import in.capgemini.OnlineFoodDelivery.repository.CustomerRepository;
import in.capgemini.OnlineFoodDelivery.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;

	
	@Override
	public Customer saveorUpdate(Customer customer) {
	
	try {
		return customerRepository.save(customer);
	}
	catch (Exception e) {
	throw new CustomerIdException("Customer Mobile Number: "+customer.getMobileNumber()+" already exist");
	}
  }

	@Override
	public Customer findCustomerByMobileNumber(String mobileNumber) {
		Customer customer= customerRepository.findByMobileNumber(mobileNumber);
		if(customer==null)
		{
			throw new CustomerIdException("Customer Mobile Number: "+mobileNumber+" does not exist");
		}
		return customer;
	}

	@Override
	public Iterable<Customer> finaAllCustomer() {
		return customerRepository.findAll();
	
	}

	@Override
	public void deleteCustomerByCustomerMobileNumber(String mobileNumber) {
		Customer customer= customerRepository.findByMobileNumber(mobileNumber);
		if(customer==null)
		{
			throw new CustomerIdException("Customer Mobile Number: "+mobileNumber+" does not exist");
		}
		customerRepository.delete(customer);
	}
}