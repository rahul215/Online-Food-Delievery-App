package in.codegram.loginapi.web;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.loginapi.domain.Login;
import in.codegram.loginapi.service.LoginService;
import in.codegram.loginapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/logins")
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	@PostMapping("")
	public ResponseEntity<?> createNewLogin(@Valid @RequestBody Login login,BindingResult result ) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap != null) return errorMap;
		Login savedLogin = loginService.saveOrUpdate(login);
		return new ResponseEntity<Login>(savedLogin,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{loginUserName}")
	public ResponseEntity<?> getLoginbyUsername(@PathVariable String loginUserName){
		Login login = loginService.findLoginByUsername(loginUserName);
		return new ResponseEntity<Login>(login,HttpStatus.OK);	
	}
	
	@GetMapping("/all")
	public Iterable<Login> getAllLogins(){
		return loginService.findAllLogin();
	}
	
	@DeleteMapping("/{loginUserName}")
	public ResponseEntity<?> deleteLogin(@PathVariable String loginUserName){
		loginService.deleteLoginByUserName(loginUserName);
		return new ResponseEntity<String>("login username : "+loginUserName+" deleted successfully!",HttpStatus.OK);
		
	}
	
	
}
