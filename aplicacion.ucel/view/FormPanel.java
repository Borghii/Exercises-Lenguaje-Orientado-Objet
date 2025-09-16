package view;

import javax.swing.*;

import entity.Persona;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class FormPanel extends JPanel {
	
    private JTextField nombre = new JTextField(10);
    private JTextField apellido = new JTextField(10);
    private JTextField documento = new JTextField(10);
    private JTextField fechaNacimiento = new JTextField(10);
    private JTextField domicilio = new JTextField(10);
    private JTextField telefono = new JTextField(10);
    private JTextField localidad = new JTextField(10);
    private JTextField codigoPostal = new JTextField(10);
    private JTextField provincia = new JTextField(10);
    private JTextField mail = new JTextField(10);

    private JButton aceptar = new JButton("ACEPTAR");
    private JButton borrar = new JButton("BORRAR");
    private JButton salir = new JButton("SALIR");

    
    public FormPanel() {
        setLayout(new BorderLayout(8,8));

        JPanel grid = new JPanel(new GridLayout(5,4,8,8));
        
   
        grid.add(new JLabel("Nombre:"));            
        grid.add(nombre);
        grid.add(new JLabel("Apellido:"));          
        grid.add(apellido);
        grid.add(new JLabel("Documento:"));        
        grid.add(documento);
        grid.add(new JLabel("Fecha nacimiento:"));  
        grid.add(fechaNacimiento);
        grid.add(new JLabel("Domicilio:"));         
        grid.add(domicilio);
        grid.add(new JLabel("Telefono:"));          
        grid.add(telefono);
        grid.add(new JLabel("Localidad:"));         
        grid.add(localidad);
        grid.add(new JLabel("Codigo Postal:"));     
        grid.add(codigoPostal);
        grid.add(new JLabel("Provincia:"));         
        grid.add(provincia);
        grid.add(new JLabel("Correo electronico:"));
        grid.add(mail);

        JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        
        
        botones.add(aceptar);
        botones.add(borrar);
        botones.add(salir);

        add(grid, BorderLayout.CENTER);
        add(botones, BorderLayout.SOUTH);
       
    
    }


    void onAceptar(ActionListener event){ 
    	aceptar.addActionListener(event); 
    }
    
    void onBorrar(ActionListener event){ 
    	borrar.addActionListener(event); 
    }
    
    void onSalir(ActionListener event){ 
    	salir.addActionListener(event); 
    }
    


    Persona getData() {
        return new Persona(
            nombre.getText(),
            apellido.getText(),
            documento.getText(),
            fechaNacimiento.getText(),
            domicilio.getText(),
            telefono.getText(),
            localidad.getText(),
            codigoPostal.getText(),
            provincia.getText(),
            mail.getText()
        );
    }

    void clear() {
        for (JTextField tf : List.of(
                nombre, apellido, documento, fechaNacimiento, domicilio,
                telefono, localidad, codigoPostal, provincia, mail)) {
        	
            tf.setText("");
            
        }
    }


}

