package practice_1;

import javax.swing.JOptionPane;

public class Practice1 {

	public static void main(String[] args) {
		
		//ex2();
		ex6();


	}
	
	public static void ex2() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
		
		System.out.printf("La suma es igual a %d", num1+num2);
		
	}
	public static void ex3() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		
		if(num1%2==0) {
			JOptionPane.showMessageDialog(null, "El numero es par: "+num1);
		}else {
			JOptionPane.showMessageDialog(null, "El numero es impar: "+num1);

		}
		
	}
	
	public static void ex4() {
		
		int total=0;
		
		for(int i = 1; i<11;i++) {
			total+=i;
		}
		
		JOptionPane.showMessageDialog(null, "Suma: "+total);

		
	}
	
	
	
	public static void ex5() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		
		for(int i = 2; i < num1; i++) {
			if(num1%i==0) {
				JOptionPane.showMessageDialog(null, "El numero es compuesto: "+num1);
				break;
			}
			if(i==num1-1) {
				JOptionPane.showMessageDialog(null, "El numero es primo: "+num1);
				break;
				
			}
		}
		
	}
	
	public static void ex6() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		boolean primo = true;
		
		for(int i = 2; i < num1; i++) {
			
			if(num1%i==0) {
				if(primo==true) {
					JOptionPane.showMessageDialog(null, "El numero no es primo");
					primo=false;
					
				}

				JOptionPane.showMessageDialog(null, "El numero es dvisible por: "+i);
			}
		}
		
		if(primo==true) {
			JOptionPane.showMessageDialog(null, "El numero es primo");
			
		}
		
		
		
	}
	


}
