package view;

import javax.swing.*;

import org.ietf.jgss.Oid;

import entity.Persona;

import java.awt.*;
import java.awt.event.ActionListener;

public class SummaryPanel extends JPanel {
	
    private JTextArea area = new JTextArea(10,40);
    
    private JButton si = new JButton("SI");
    private JButton editar = new JButton("EDITAR");

    public SummaryPanel() {
        setLayout(new BorderLayout(8,8));
        
        area.setEditable(false);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        add(area, BorderLayout.CENTER);

        JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
        south.add(new JLabel("¿Es correcto?"));
        south.add(si);
        south.add(editar);
        
        add(south, BorderLayout.SOUTH);
    }

    void showData(Persona d) {
        area.setText(String.format("""
                Los datos ingresados son:
                Nombre: %s
                Apellido: %s
                Documento: %s
                Fecha Nacimiento: %s
                Domicilio: %s
                Telefono: %s
                Cod Postal: %s
                Localidad: %s
                Correo Electronico: %s
                Provincia: %s
                """,
            d.nombre(), d.apellido(), d.documento(), d.fechaNacimiento(),
            d.domicilio(), d.telefono(), d.codigoPostal(), d.localidad(),
            d.mail(), d.provincia()
        ));
        
    }

    void onEditar(ActionListener event) {
    	editar.addActionListener(event); 
    }
    
    
    
    void onSi(ActionListener event) {
    	si.addActionListener(event);
    }
   
}
