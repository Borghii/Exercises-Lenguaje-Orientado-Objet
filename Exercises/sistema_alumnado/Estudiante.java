package sistema_alumnado;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Estudiante {
	
	private String nombre;
	private double nota1;
	private double nota2;
	

	public Estudiante(String nombre, double nota1, double nota2) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public Estudiante() {
	}

	public double calculateAvg() throws NumberFormatException{
		return (nota1+nota2)/2;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() { 
		return nombre;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	

	private static void validateOrThrow(double nota) throws NotaInvalida {
		if(nota<0 || nota>10) {
			throw new NotaInvalida();
		}
	}

	public static void main(String args[]) {
		
		Estudiante e1 = new Estudiante();
		double nota1=0;
		double nota2=0;
		boolean error = false;
		
		do {
			try {
				
				nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota 1"));
				validateOrThrow(nota1);
				nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese nota 2"));
				validateOrThrow(nota2);

				error=false;
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Ingrese un valor valido");
				error=true;
			}catch (NotaInvalida e) {
				JOptionPane.showMessageDialog(null,"Ingrese un valor mayor a 0 o menor a 10");
				error=true;
			}
			
		}while(error); 
		

		
		e1.setNota1(nota1);
		e1.setNota2(nota2);
		
	
		
		JOptionPane.showMessageDialog(null, e1.calculateAvg());

		

		
	}

}
