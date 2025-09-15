package service;

import entity.User;
import repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	@Override
	public boolean authenticate(String user, String pass) throws UserNotFoundException, InvalidPasswordException {
		
		 User user2 =  userRepository.findByUsername(user)
				 .orElseThrow(()-> new UserNotFoundException("The user doesn't exist"));
		 
		 if (user2.getPassword().equals(pass)) {
			return true;
		 }else {
			throw new InvalidPasswordException("The password is incorrect");
		 }
		 
	}
	
}
