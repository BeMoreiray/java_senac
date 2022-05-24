package aula005;

import java.util.Scanner;

public class AppScan {

	public static void main(String[] args) {
		int numeroLido;
		String textoLido;  
		
		Scanner teclado = new Scanner(System.in); //instanciação de uma variavel, é necessário ter o tipo scanner. 
		
		System.out.println("Digite um número: ");
		numeroLido = teclado.nextInt(); //o método .next, tem a função de reservar o local de digitação para a variavel armazenar o resultado digitado.
										// por isso sempre é colocado o tipo (int) nofinal do next
		
		System.out.println("Digite um nome: ");
		textoLido = teclado.next();
		
		System.out.println("O valor digitado foi: " + numeroLido);
		System.out.println("Seu nome é " + textoLido);

	}

}
