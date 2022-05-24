package zoologico;

public class Pelicano {
//Explica��o objeto-----------------------
	
	private boolean bico; //privando informa��es atribuidas na variavel private
	private String cor;
	private int peso;
	
	// M�todo de conigura��o de atributos -------------------
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
	//Implementa��o de m�todo-------------
	
	public void voar() {
		if(peso > 50) {
			System.out.println("O pelicano n�o consegue voar, est� muito pesado");
		}else {
		System.out.println("O pelicano est� voando!");
	    }
}
	public void comer() {
		System.out.println("O pelicano est� comendo");
	}

	//M�todo com parametro.
	public void definirNome(String nome) {
		System.out.println("O nome desse pelicano � " + nome);
	}
	public String retornarCor() {    //m�todo que retorna algo que ja foi determinado, por isso String em vez de void.
		return cor;
	}
}
