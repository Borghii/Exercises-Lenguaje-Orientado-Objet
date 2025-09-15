package src;

import controller.UserController;
import repository.InMemoryUserRepository;
import repository.UserRepository;
import service.UserService;
import service.UserServiceImpl;
import view.LoginView;

public class Main {
	
	private static final String[][] USERS = new String[][]{
		{"INES", "00000"},
		{"PEDRO", "11111"},
		{"JUAN", "22222"},
		{"ANA", "33333"},
		{"MABEL", "44444"}
		};

	public static void main(String[] args) {
		
		UserRepository userRepository = new InMemoryUserRepository(USERS);
		UserService userService = new UserServiceImpl(userRepository);
		UserController userController = new UserController(userService);
		LoginView loginView = new LoginView(userController);
		loginView.setVisible(true);

	}

}
