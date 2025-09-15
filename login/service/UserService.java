package service;

public interface UserService {
	boolean authenticate(String user, String pass) throws UserNotFoundException, InvalidPasswordException;
}
