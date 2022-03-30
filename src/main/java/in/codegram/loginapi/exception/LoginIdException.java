package in.codegram.loginapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST)
public class LoginIdException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public LoginIdException() {
		super();
	}
	public LoginIdException(String errMsg) {
		super(errMsg);
	}
}
