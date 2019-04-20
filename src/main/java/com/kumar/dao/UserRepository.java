package com.kumar.dao;

import com.kumar.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByUsernameAndPassword(String username, String password);
	User findByUsername(String username);

}
