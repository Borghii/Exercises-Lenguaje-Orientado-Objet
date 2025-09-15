package repository;

import java.util.Optional;

import entity.User;

public class InMemoryUserRepository implements UserRepository{
	
	private String[][] users;
	
	public InMemoryUserRepository (String[][] users) {
		this.users = users;
	}
	
	@Override
	public Optional<User> findByUsername(String username) {
		
		
		for (int i = 0; i < 5; i++) {
			if (username.equals(users[i][0])) {
				System.out.println("Usuario encontrado");
				return Optional.of(new User(users[i][0],users[i][1])) ;
			}
		}
		
		
		return Optional.empty();
	}

}
