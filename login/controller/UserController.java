package controller;


import java.util.logging.Logger;

import service.InvalidPasswordException;
import service.UserNotFoundException;
import service.UserService;
import service.UserServiceImpl;

public class UserController {

    //private static final Logger logger = Logger.getLogger(UserController.class.getName());

	
	private UserService userService;
	
	
	
	public UserController(UserService userService) {
		this.userService = userService;
	}



	public boolean login(String user, String password) throws UserNotFoundException, InvalidPasswordException {
		return userService.authenticate(user, password);
		
	}

}
