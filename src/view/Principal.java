package view;

import controller.RecursividadeController;
import util.Metodos;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		RecursividadeController rc = new RecursividadeController();
		
		int num = metodos.recebeNum();
		
		JOptionPane.showMessageDialog(null, "O fatorial de " +num +" é: " +rc.calcFatorial(num));
	}
}