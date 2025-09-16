package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import entity.Persona;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFormView extends JFrame {
	
	private CardLayout cards = new CardLayout();
    private JPanel root = new JPanel(cards);

    private FormPanel form = new FormPanel();
    
    
    private SummaryPanel summary = new SummaryPanel();

    public ApplicationFormView() {
        super("Ingreso de datos");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        setContentPane(root);
        
        root.add(form, "FORM");
        root.add(summary, "SUMMARY");
        

        
        
        summary.onEditar(e -> {    
            cards.show(root, "FORM");
        });
        
        summary.onSi(e -> {
        	JOptionPane.showMessageDialog(null, "Aplicacion realizada correctamente");
        	form.clear();
        	cards.show(root, "FORM");
        	}
		);
        
       
        form.onAceptar(e -> {
            Persona data = form.getData();
            summary.showData(data);
            cards.show(root, "SUMMARY");
        });
        


        form.onSalir(e -> dispose());
        
        form.onBorrar(e -> form.clear());

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

