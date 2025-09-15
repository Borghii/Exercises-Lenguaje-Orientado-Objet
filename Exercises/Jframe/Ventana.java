package Jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.File;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
	
	public Ventana() {
		
		this.setSize(500,500);//Establecemos tamaños ventana
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Hello World");
		//this.setLocation(100, 200);//Estableciemos posicion inicial ventana
		
		//this.setBounds(100, 200, 500, 500);
		
		this.setResizable(true);//para que no puedan cambiar tamaño
		
		this.setLocationRelativeTo(null);
		
		
		//initializeComponents();
		//colocarRadioButtons();
		colocarCajasDeTexto();
	}
	
	
	private void colocarCajasDeTexto() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextField jTextField = new JTextField();
		
		jTextField.setBounds(100,100,100,50);
		
		jTextField.setText("Hola");
		
		panel.add(jTextField);
		
		this.getContentPane().add(panel);
		
		
	}


	private void colocarRadioButtons() {
		JPanel panel = new JPanel();

		JRadioButton radioButton =  new JRadioButton("Opcion 1", true);
		radioButton.setBounds(10,10,10,10);
		panel.add(radioButton);

		
		JRadioButton radioButton2 =  new JRadioButton("Opcion 2", true);
		radioButton.setBounds(10,10,10,10);
		panel.add(radioButton2);

		
		JRadioButton radioButton3 =  new JRadioButton("Opcion 3", true);
		radioButton.setBounds(10,10,10,10);
		panel.add(radioButton3);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(radioButton);
		buttonGroup.add(radioButton2);
		buttonGroup.add(radioButton3);
		
		this.getContentPane().add(panel);

	}


	private void initializeComponents() {
		
		JPanel panel = new JPanel();

		JLabel etiqueta = new JLabel("Copa del mundo 2018", SwingConstants.CENTER);
		etiqueta.setOpaque(true);
		
		etiqueta.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		
		System.out.println("Directorio actual: " + System.getProperty("user.dir"));
		
		
		File file = new File("copa.jpg");
		System.out.println("El archivo existe: " + file.exists());
		System.out.println("Tamaño del archivo: " + file.length() + " bytes");

		ImageIcon icon = new ImageIcon("copa.jpg");
		System.out.println("ImageIcon creado");
		System.out.println("Descripción del icono: " + icon.getDescription());
		System.out.println("Ancho de la imagen: " + icon.getIconWidth());
		System.out.println("Alto de la imagen: " + icon.getIconHeight());
		System.out.println("Estado de carga: " + icon.getImageLoadStatus());
		System.out.println("Tamaño del archivo: " + file.length() + " bytes");
		
		
		
		
		
		
		// Escalar una sola vez a 200x200
		Image scaled = icon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
		ImageIcon fixedIcon = new ImageIcon(scaled);

		// JLabel con imagen fija
		JLabel labelImage = new JLabel(fixedIcon, SwingConstants.CENTER);

		//JLabel labelImage = new JLabel(new ImageIcon(getClass().getResource("copa.jpg")));
		labelImage.setHorizontalAlignment(SwingConstants.CENTER);

		// Etiqueta arriba, imagen al centro
		panel.add(etiqueta, BorderLayout.NORTH);
		panel.add(labelImage, BorderLayout.CENTER);
		
		

		this.getContentPane().add(panel);
		
		
		JButton jButton = new JButton();
		jButton.setText("Hola");
		jButton.setEnabled(true);
		jButton.setBounds(100,100, 100, 40);
		
		panel.add(jButton, BorderLayout.EAST);
		
		
		JButton jButton2 = new JButton();
		jButton2.setText("Hola perro");
		jButton2.setEnabled(true);
		jButton2.setBounds(100,100, 100, 40);
		jButton2.setOpaque(true);
		jButton2.setBackground(Color.BLACK);
		
		ImageIcon imageIcon = new ImageIcon("copa.jpg");
		
		jButton2.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(10,10, DO_NOTHING_ON_CLOSE)));
		
		panel.add(jButton2, BorderLayout.EAST);
		
		
		
	}
	

	
}
