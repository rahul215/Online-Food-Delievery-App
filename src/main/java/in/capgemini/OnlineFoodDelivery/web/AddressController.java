package in.capgemini.OnlineFoodDelivery.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.capgemini.OnlineFoodDelivery.domain.Address;
import in.capgemini.OnlineFoodDelivery.service.AddressService;
import in.capgemini.OnlineFoodDelivery.service.MapValidationErrorService;


@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewAddress(@Valid @RequestBody Address address, BindingResult result)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		Address savedAddress= addressService.saveorUpdate(address);
		return new ResponseEntity<Address>(savedAddress,HttpStatus.CREATED);
	}
	
	@GetMapping("/{addressId}")
	public ResponseEntity<?> getAddressByCity(@PathVariable Long addressId)
	{
		Address address=addressService.findAddressById(addressId);
		return new ResponseEntity<Address>(address,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public Iterable<Address> getAllAddress()
	{
		return addressService.finaAllAddress();
	}
	
	@DeleteMapping("/{addressId}")
	public ResponseEntity<?> deleteAddress(@PathVariable Long addressId)
	{
		addressService.deleteAddressByAddressId(addressId);
		return new ResponseEntity<String>("Address with address id :"+addressId+" deleted successfully",HttpStatus.OK);
	}
}
