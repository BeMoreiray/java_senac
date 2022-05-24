package calculando;

public class Calculadora {
	private int valor1; 
	private int valor2;
	
	
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int somar(int a, int b) {
		this.valor1 = a;
		this.valor2 = b;
		return valor1 + valor2;
	}
	
	public int subtrair(int a, int b){
		this.valor1 = a;
		this.valor2 = b;
		return valor1 - valor2;
	}
	
	public int multiplicar(int a, int b) {
		this.valor1 = a;
		this.valor2 = b;
		return valor1 * valor2;
	}
	
	public int dividir(int a, int b) {
		int retorno;
		if(b == 0) {
			retorno = b;
		}else {
			this.valor1 = a;
			this.valor2 = b;
			
			retorno = valor1/valor2;
		}
		
		return retorno;
		
		
	}
}
