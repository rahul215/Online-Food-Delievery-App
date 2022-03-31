package in.capgemini.OnlineFoodDelivery.exception;

public class CustomerIdExceptionResponse {
	
	private String mobileNumber;

	public CustomerIdExceptionResponse(String mobileNumber)
	{
		super();
		this.mobileNumber = mobileNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


}
