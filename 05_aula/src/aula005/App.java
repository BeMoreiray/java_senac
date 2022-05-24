package aula005;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>(); //para a inicializa��o da classe ArrayList, � necess�rio colocar seu tipo
															//o tipo de ArrayList para iniciar � List.
		lista.add("Matheus");
		lista.add("Jo�o");
		lista.add("Beatriz");
		lista.add("Vinicius");
		
		for(String temp: lista) {
			System.out.println(temp);
		}
		
		//Procurando um elemento dentro do array
		System.out.println("O array tem " + lista.size() + " elementos."); //informa quantos elementos tem dentro do array
		 
		System.out.println(lista.contains("Beatriz")); //identifica se o array tem o elemento informado
		System.out.println("O valor est� no �ndice " + lista.indexOf("Beatriz")); //indica em qual indicie est� o elemento desejado
		System.out.println("O conteudo do indicie 3 � " + lista.get(3)); //indica qual � o elemento que est� no indicie informado.
		
	}										 

}
