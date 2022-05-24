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
		System.out.println("Escolha uma das opera��es(+, -, *, /)");
	 	operacao = teclado.next();
	 	
	 	System.out.println("O resultado �: ");
	 		 
		
	 	
		 System.out.println("Voc� deseja realizar outra opera��o?");
		 continuando = teclado.next();
		 
	 	 }while(continuando.equals("sim"));
	 	
		 
		
		
		 teclado.close();

	}
	public double calcular(double primeiroNumero, double segundoNumero, String operacao) {
		Calculadora calculadora = new Calculadora();
		double resultado;
		 
		if(operacao.equals("+")) { //para vc encontrar o valor correto que est� armazenado em variavel � necess�rio usar o equals, j� que os simbolos usados n�o s�o identificados pelo sistema
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
