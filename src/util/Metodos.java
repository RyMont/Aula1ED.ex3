package util;

import javax.swing.JOptionPane;

public class Metodos {	
	
	// só pra n poluir a classe principal, to colocando aq :)
	public int recebeNum() {
		int num;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para calcular o fatorial:"));
			
			if (num > 12) {
				JOptionPane.showMessageDialog(null, "Numero deve ser menor que 12.");		// maior que 12 dá erro
			}
			if (num < 0) {
				JOptionPane.showMessageDialog(null, "Numero deve ser maior que 0.");		// menor que 0 n faz sentido e da erro
			}																				// ent to botando aq tb :)
		} while (num>12 || num<0);
		
		return num;
	}
}
