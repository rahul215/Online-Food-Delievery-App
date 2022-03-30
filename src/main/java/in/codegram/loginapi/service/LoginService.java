package in.codegram.loginapi.service;

import in.codegram.loginapi.domain.Login;

public interface LoginService {
	
	public Login saveOrUpdate(Login login);
	public Login findLoginByUsername(String userName);
	
	public Iterable<Login> findAllLogin();
	public void deleteLoginByUserName(String userName);

}
