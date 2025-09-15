package repository;

import java.util.Optional;

import entity.User;


public interface UserRepository {
	Optional<User> findByUsername(String username);
}
