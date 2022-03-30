package in.codegram.loginapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codegram.loginapi.domain.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Long>  {
	
	Login findByUserName(String userName);

}
