package aula005;

import java.util.Scanner;

public class AppScan {

	public static void main(String[] args) {
		int numeroLido;
		String textoLido;  
		
		Scanner teclado = new Scanner(System.in); //instancia��o de uma variavel, � necess�rio ter o tipo scanner. 
		
		System.out.println("Digite um n�mero: ");
		numeroLido = teclado.nextInt(); //o m�todo .next, tem a fun��o de reservar o local de digita��o para a variavel armazenar o resultado digitado.
										// por isso sempre � colocado o tipo (int) nofinal do next
		
		System.out.println("Digite um nome: ");
		textoLido = teclado.next();
		
		System.out.println("O valor digitado foi: " + numeroLido);
		System.out.println("Seu nome � " + textoLido);

	}

}
