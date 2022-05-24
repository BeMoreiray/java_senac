package exCasa;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		int op;
		
		Calculadora calc = new Calculadora();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		 calc.setValor1(teclado.nextInt());
		
		
		System.out.println("Digite o segundo valor: ");
		 	calc.setValor2(teclado.nextInt());
		 	
		 	
		 	
		 System.out.println("Digite a operação desejada:  \n 1: + \n 2: - \n 3: * \n 4: / ");
	 		op = teclado.nextInt();
		 	
		 	if(op == (1)) {
		 		System.out.println("O resultado da soma de dois valores é: " + calc.somar());
		 	}else if(op == (2)){
		 		System.out.println("O resultado da subtração de dois valores é: " + calc.subtrair());
		 	}else if(op == (3)) {
		 		System.out.println("O resultado da multiplicação de dois valores é: " + calc.multiplicar());
		 	}else if(op == (4)) {
		 		System.out.println("O resultado da divisão de dois valores é: " + calc.dividir());
		 	}
		 
		 	
		 	teclado.close();
		 	
		 	

		 	
		
		
		
		
		
		
		
		/*System.out.println("O resultado da operação é: " + calc.somar(1, 2));
		
		calculo = calc.dividir(6,0);
		
		if(calculo == 0) {
			System.out.println("Não é permitido usar 0 na divisão");
		}else {
			System.out.println("Dividir" + calculo);
		}*/
		
	      

	}

}
