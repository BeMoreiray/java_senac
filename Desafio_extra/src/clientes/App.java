package clientes;


import java.util.Scanner;

import controle.Controle;
import modelo.Carteira;
import visao.Menu;


public class App {
	public static void main(String[] args) {
		
	
	
	
	//Carteira carteira = new Carteira();
	Controle controle = new Controle();
	Menu menu = new Menu();
	
	Scanner teclado = new Scanner(System.in);
	
	int resposta;
	do {
		
		
		menu.desenharMenu();
		resposta = teclado.nextInt();
		controle.avaliarOpcao(resposta);
		
		
	
	}while(resposta < 5);
	System.out.println("Fim do programa!");
		teclado.close();
	}
}

