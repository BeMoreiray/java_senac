package exCasa;

import java.util.Scanner;

public class Correcao {

	public static void main(String[] args) {
		double primeiroNumero, segundoNumero;
		String operacao;
		String continuando;
	 	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		primeiroNumero = teclado.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		segundoNumero = teclado.nextDouble();
		
		do {
		System.out.println("Escolha uma das operações(+, -, *, /)");
	 	operacao = teclado.next();
	 	
	 	System.out.println("O resultado é: ");
	 		 
		
	 	
		 System.out.println("Você deseja realizar outra operação?");
		 continuando = teclado.next();
		 
	 	 }while(continuando.equals("sim"));
	 	
		 
		
		
		 teclado.close();

	}
	public double calcular(double primeiroNumero, double segundoNumero, String operacao) {
		Calculadora calculadora = new Calculadora();
		double resultado;
		 
		if(operacao.equals("+")) { //para vc encontrar o valor correto que está armazenado em variavel é necessário usar o equals, já que os simbolos usados não são identificados pelo sistema
		 		resultado = calculadora.somar(primeiroNumero, segundoNumero);
		 	}else if(operacao.equals("-")){
		 		resultado = calculadora.subtrair(primeiroNumero, segundoNumero);
		 	}else if(operacao.equals("*")) {
		 		resultado = calculadora.multiplicar(primeiroNumero, segundoNumero);
		 	}else {
		 		resultado = calculadora.dividir(primeiroNumero, segundoNumero);
		 	}
		return resultado;
	}

}
