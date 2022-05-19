package com.joshburg.test.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.joshburg.test.models.LoginUser;
import com.joshburg.test.models.User;
import com.joshburg.test.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepo;
	
    public User register(User newUser, BindingResult result) {
       
    	Optional<User> ifUser = userRepo.findByEmail(newUser.getEmail());
    	
    	// Reject if email is taken (present in database)
    	if(ifUser.isPresent()) {
    		result.rejectValue("email", "Matches", "An account with that email already exists!");
    	}
    	
        // Reject if password doesn't match confirmation
    	if( ! newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	
    	// Return null if result has errors
    	if(result.hasErrors()) {
    		return null;
    	}
    
        // Hash and set password, save user to database
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	return userRepo.save(newUser);
    	
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
    	
    	Optional<User> ifUser = userRepo.findByEmail(newLogin.getEmail());
        
    	// Find user in the DB by email
        
    	if( ! ifUser.isPresent()) {
    		result.rejectValue("email", "Matches", "Invalid Credentials!");
    		return null;
    	}
    	
    	// User exists, retrieve user from DB
    	User user = ifUser.get();
        
        // Reject if BCrypt password match fails
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Credentials!");
    	}
    	
    	// Return null if result has errors
    	if(result.hasErrors()) {
    		return null;
    	}
    	
        // Otherwise, return the user object
        return user;
    }
    
    public User findById(Long id) {
    	Optional<User> ifUser = userRepo.findById(id);
    	if(ifUser.isPresent()) {
    		return ifUser.get();
    	}
    	return null;
    }

}