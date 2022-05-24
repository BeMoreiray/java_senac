package zoologico;

public class Zoologico {

	public static void main(String[] args) {
		Pelicano p1, p2; //classe criada em Pelicano.java
		
		p1 = new Pelicano(); //new � um m�todo que permite a Transforma��o da class em um objeto
		p2 = new Pelicano();
		
		p1.setCor ("branco");
		p1.setPeso(80);
		p2.setCor("preto");
		p2.setPeso(30);
		
		
		p1.voar();
		p2.comer();
		p1.definirNome("Bia");
		
		System.out.println("O pelicano p1 �: " + p1.getCor());
		System.out.println("O pelicano p2 �: " + p2.getCor());
		System.out.println("outra forma de retornar a cor " + p2.retornarCor());
	}

}
