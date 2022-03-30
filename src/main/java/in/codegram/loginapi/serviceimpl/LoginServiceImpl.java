package in.codegram.loginapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.loginapi.domain.Login;
import in.codegram.loginapi.exception.LoginIdException;
import in.codegram.loginapi.repository.LoginRepository;
import in.codegram.loginapi.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login saveOrUpdate(Login login) {
		
		try {
			//Biz logic
			return loginRepository.save(login);
		}
		catch(Exception ex) {
			throw new LoginIdException("UeserName : "+login.getUserName()+" already exist");
		}
	}

	@Override
	public Login findLoginByUsername(String userName) {
		Login login = loginRepository.findByUserName(userName);
		if(login==null) {
			throw new LoginIdException("UserName : "+userName+" does not exist");
		}
		return login;
	}

	@Override
	public void deleteLoginByUserName(String userName) {
		Login login = loginRepository.findByUserName(userName);
		if(login==null) {
			throw new LoginIdException("UserName : "+userName+" does not exist");
		}
		
		loginRepository.delete(login);
		
	}

	@Override
	public Iterable<Login> findAllLogin() {
		
		return loginRepository.findAll();
	}

}
