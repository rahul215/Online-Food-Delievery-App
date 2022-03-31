package in.capgemini.OnlineFoodDelivery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CustomerIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerIdException()
	{
		super();
	}
	public CustomerIdException(String ex)
	{
		super(ex);
	}
}
