

/* 
 *                        DOCUMENTS
 */


package in.codegram.loginapi.exception;

public class LoginIdExceptionResponse {
	private String userName;

	public LoginIdExceptionResponse(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
