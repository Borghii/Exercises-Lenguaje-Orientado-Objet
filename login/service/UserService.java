package service;

import exception.InvalidPasswordException;
import exception.UserNotFoundException;

public interface UserService {
	boolean authenticate(String user, String pass);
}
