package practice_2;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PracticeArrays {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex4();

	}
	
	private static void ex1() {
		
		
		JTextArea textBox = new JTextArea(2,2);
		
		float a = Float.parseFloat(JOptionPane.showInputDialog("Inrese a: "));
		float b = Float.parseFloat(JOptionPane.showInputDialog("Inrese b: "));
		
		float x;

		float y;

		
		for(int i=0; i<10; i++) {
			
			x = (float) (Math.random()*i);
			
			y = a*x + b;
			
			String pair = x+","+y;
			
			//String pair = String.format("%.2f, %.2f \n", x,y);
			
			textBox.append(pair);
		}
		
		JOptionPane.showMessageDialog(null, textBox);

		
	}
	
	
	private static void ex2() {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Inrese a: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Inrese b: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Inrese c: "));
		
		
		double discriminante = Math.pow(b, 2)-4*a*c;
		
		if(discriminante<0) {
			JOptionPane.showMessageDialog(null, "No tiene solucion");

		}else if(discriminante>0) {
			
			double x1 = (-b+Math.sqrt(discriminante))/(2*a);
			double x2 = (-b-Math.sqrt(discriminante))/(2*a);
			
			JOptionPane.showMessageDialog(null, String.format("x1: %.2f x2: %.2f ",x1,x2));
			
		}else {
			
			double x = -b/(2*a);
			JOptionPane.showMessageDialog(null, String.format("x: %.2f",x));

		}

	}
	
	private static void ex3() {
		
		double total = 0;
		
		String opcionProducto;
	
		String[] productos = {"Pelota", "Termo", "Auto","Computadora", "Yerba"};
		
		
		while(true) {
			
			Object opcion = JOptionPane.showInputDialog(null, "Ingrese producto a comprar", null, JOptionPane.QUESTION_MESSAGE, null, productos, null);
			
			if(opcion ==null)break;
				
			opcionProducto = (String) opcion;
		
			int cant = Integer.parseInt(JOptionPane.showInputDialog("Inrese la cantidad: "));
			
			switch(opcionProducto) {
			
				case "Pelota":
					total+=(cant*10);
					break;

				case "Termo":
					total+=(cant*90);

					break;

				case "Auto":
					total+=(cant*15);

					break;

				case "Computadora":
					total+=(cant*43);

					break;

				case "Yerba":
					total+=(cant*23);

					break;

			}
			
			
			
		}
		

		JOptionPane.showMessageDialog(null, String.format("Total: %.2f ",total));
		
	}
	
	private static void ex4() {
		
		int totFem=0;
		int totMas=0;
		
		int[] vot = new int[6];
		

		

		
		int cantVot = Integer.parseInt(JOptionPane.showInputDialog("Inrese la cantidad de votantes: "));
		
		String[] opsSexo = {"Masculino", "Femenino"};
		Integer[] opsNum = {1,2,3,4,5};

		
		for(int i=0; i<cantVot;i++ ) {
			
			String opSexo = (String)JOptionPane.showInputDialog(null, "Ingrese sexo", null, JOptionPane.QUESTION_MESSAGE, null, opsSexo, null);

			if(opSexo.equals("Masculino")) {
				totMas++;
			}else {
				totFem++;
			}
			

			Object opNum = JOptionPane.showInputDialog(null, "Ingrese sexo", null, JOptionPane.QUESTION_MESSAGE, null, opsNum, null);
			
			if(opNum==null) {
				vot[5]++;
			}else{
				vot[(Integer)opNum-1]++;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, String.format("Votos Femenino: %d \n"
														+ "Votos Masculino: %d \n ",totFem, totMas));

		
	}

}
