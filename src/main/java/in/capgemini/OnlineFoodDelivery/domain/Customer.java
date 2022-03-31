package in.capgemini.OnlineFoodDelivery.domain;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
    @NotBlank(message="Please Enter Your First Name!!")
	private String firstName;
    @NotBlank(message = "Please Enter Your Last Name!!")
	private String lastName;
    @NotBlank(message = "Please Enter Your age!!")
    private String age;
    private String gender;
    @NotBlank(message = "Please Enter Your Mobile Number!!")
    @Size(min = 10, max=10, message = "Please Enter Correct Mobile Number")
    @Column(updatable = false, unique = true)
	private String mobileNumber;
    @NotBlank(message = "Please Enter Your Email Id!!")
	private String email;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Address address;
    
  
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer() {
		super();
	}
	public Long getCustomerId() {
		return Id;
	}
	public void setCustomerId(Long customerId) {
		this.Id = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


}