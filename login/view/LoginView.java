package view;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.UserController;
import service.InvalidPasswordException;
import service.UserNotFoundException;

public class LoginView extends JFrame{
	
	private UserController userController;
	
	
	
	
	public LoginView(UserController userController) throws HeadlessException {
		
		this.userController = userController;
		
		this.setSize(400,150);
		this.setTitle("Ingreso de datos");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		gui();
	}

	JTextField usuario = new JTextField(20);
	JPasswordField pass = new JPasswordField(20);
	JLabel etiquetaUsuario = new JLabel ("Usuario: ");
	JLabel etiquetaContrasenia = new JLabel ("Contraseña: ");
	JButton ingresar = new JButton("Ingresar");
	JButton borrar = new JButton("Borrar");

	
	public void gui() 
	{
		JPanel panel1 =new JPanel();
		panel1.setLayout(new GridLayout(3, 2));
		this.getContentPane().add(panel1);
	
		panel1.add(etiquetaUsuario);
		panel1.add(usuario);
		panel1.add(etiquetaContrasenia);
		panel1.add(pass);
		panel1.add(ingresar);
		panel1.add(borrar);
		
		
        ingresar.addActionListener(e -> validarCredenciales());
        borrar.addActionListener(e -> limpiarCampos());
    }
    
    private void validarCredenciales() {
        try {
			userController.login(usuario.getText(), pass.getText());
			
			JOptionPane.showMessageDialog(this, "Login successful");
			
		} catch (UserNotFoundException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		} catch (InvalidPasswordException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
           
        limpiarCampos();
    }
    
    private void limpiarCampos() {
        usuario.setText("");
        pass.setText("");
    }
}
