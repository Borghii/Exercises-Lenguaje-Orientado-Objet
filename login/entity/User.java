package entity;


public class User {
	private final String username;
	private final String password; 
	
	
	public User(String username, String passwordPlain) {
		this.username = username;
		this.password = passwordPlain;
	}
	
	
	public String getUsername() { return username; }
	public String getPassword() { return password; }
	}
