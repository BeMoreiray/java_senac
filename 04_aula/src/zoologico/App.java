package zoologico;

import animais.Animal;
import animais.Dog;
import animais.Gato;
import animais.Leao;
import animais.Tatu;

public class App {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Leao leao = new Leao();
		Tatu tatu = new Tatu();
		Dog cao = new Dog();
		
		gato.setCor("Branco e Preto");
		gato.setPeso(20);
		gato.setTamanho(5);
		gato.setNome("Brutus");
		
		System.out.println(gato.getNome() + ", " + gato.brincar());
		System.out.println(leao.comer());
		System.out.println(tatu.emitirSom());
		System.out.println(gato.emitirSom());
		
		//Classe pet --------------------------------------------
		System.out.println(cao.brincar());
		System.out.println(cao.emitirSom());
		System.out.println(cao.comer());
		
		//Inserção de array para cada animal,
		Animal[] animais = new Animal[4];
		
		animais[0] = new Leao();
		animais[1] = new Tatu();
		animais[2] = new Gato();
		animais[3] = new Dog();
		
		//duvida sobre reprodução do syso com o array e o método
		
		System.out.println("Esse gato tem a cor " + gato.getCor() + " e pesa o total de " + gato.getPeso() + "Kg, e o som que ele faz é " + gato.emitirSom());
	}

}
