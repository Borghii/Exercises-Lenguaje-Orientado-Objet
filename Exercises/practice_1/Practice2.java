package practice_1;

import javax.swing.JTextArea;
import javax.swing.JOptionPane;


public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JTextArea textBox = new JTextArea(1,1);
		
		//textBox.setText("Hola");
		textBox.append("Hola\n");
		
		JOptionPane.showMessageDialog(null, textBox);

		
		

	}

}
