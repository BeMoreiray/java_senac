package exCasa;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		int op;
		
		Calculadora calc = new Calculadora();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		 calc.setValor1(teclado.nextInt());
		
		
		System.out.println("Digite o segundo valor: ");
		 	calc.setValor2(teclado.nextInt());
		 	
		 	
		 	
		 System.out.println("Digite a opera��o desejada:  \n 1: + \n 2: - \n 3: * \n 4: / ");
	 		op = teclado.nextInt();
		 	
		 	if(op == (1)) {
		 		System.out.println("O resultado da soma de dois valores �: " + calc.somar());
		 	}else if(op == (2)){
		 		System.out.println("O resultado da subtra��o de dois valores �: " + calc.subtrair());
		 	}else if(op == (3)) {
		 		System.out.println("O resultado da multiplica��o de dois valores �: " + calc.multiplicar());
		 	}else if(op == (4)) {
		 		System.out.println("O resultado da divis�o de dois valores �: " + calc.dividir());
		 	}
		 
		 	
		 	teclado.close();
		 	
		 	

		 	
		
		
		
		
		
		
		
		/*System.out.println("O resultado da opera��o �: " + calc.somar(1, 2));
		
		calculo = calc.dividir(6,0);
		
		if(calculo == 0) {
			System.out.println("N�o � permitido usar 0 na divis�o");
		}else {
			System.out.println("Dividir" + calculo);
		}*/
		
	      

	}

}
