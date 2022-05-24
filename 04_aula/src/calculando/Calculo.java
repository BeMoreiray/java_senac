package calculando;

public class Calculo {

	public static void main(String[] args) {
		double calculo = 0;
		
		Calculadora calc = new Calculadora();
		
		System.out.println("O resultado da operação é: " + calc.somar(1, 2));
		
		calculo = calc.dividir(6,0);
		
		if(calculo == 0) {
			System.out.println("Não é permitido usar 0 na divisão");
		}else {
			System.out.println("Dividir" + calculo);
		}
		
	      

	}

}
