package zoologico;

public class Pelicano {
//Explicação objeto-----------------------
	
	private boolean bico; //privando informações atribuidas na variavel private
	private String cor;
	private int peso;
	
	// Método de coniguração de atributos -------------------
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
	this.cor = cor;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int cor) {
		this.peso = peso;
	}
	//Implementação de método-------------
	
	public void voar() {
		if(peso > 50) {
			System.out.println("O pelicano não consegue voar, está muito pesado");
		}else {
		System.out.println("O pelicano está voando!");
	    }
}
	public void comer() {
		System.out.println("O pelicano está comendo");
	}

	//Método com parametro.
	public void definirNome(String nome) {
		System.out.println("O nome desse pelicano é " + nome);
	}
	public String retornarCor() {    //método que retorna algo que ja foi determinado, por isso String em vez de void.
		return cor;
	}
}
