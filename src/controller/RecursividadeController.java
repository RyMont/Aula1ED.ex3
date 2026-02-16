package controller;

public class RecursividadeController {
	public int calcFatorial(int num) {
		
		//ponto de parada, num == 0; retorna 1
		if (num == 0) {
			return 1;
		}
		
		else {
			return num * calcFatorial(num-1); 	// enquanto for maior que 0
		}										// retona a multiplicacao do termo atual pelo
	}											// que o antecede, retirando 1 do proximo numero a ser multiplicado
}
