package aula005;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>(); //para a inicialização da classe ArrayList, é necessário colocar seu tipo
															//o tipo de ArrayList para iniciar é List.
		lista.add("Matheus");
		lista.add("João");
		lista.add("Beatriz");
		lista.add("Vinicius");
		
		for(String temp: lista) {
			System.out.println(temp);
		}
		
		//Procurando um elemento dentro do array
		System.out.println("O array tem " + lista.size() + " elementos."); //informa quantos elementos tem dentro do array
		 
		System.out.println(lista.contains("Beatriz")); //identifica se o array tem o elemento informado
		System.out.println("O valor está no índice " + lista.indexOf("Beatriz")); //indica em qual indicie está o elemento desejado
		System.out.println("O conteudo do indicie 3 é " + lista.get(3)); //indica qual é o elemento que está no indicie informado.
		
	}										 

}
