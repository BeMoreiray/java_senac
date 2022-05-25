package amigoCulto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AmigoCulto {
	 public static void main(String[] args) {
		Random sorteio = new Random();
		String valores;
		 List<String> nomes = new ArrayList<String>();
			
			nomes.add("Matheus");
			nomes.add("Joao");
			nomes.add("Beatriz");
			nomes.add("Marcus");
			nomes.add("Vinicius");
			nomes.add("Lucas Renan");
			nomes.add("Lucas");
			nomes.add("Danilo");
			nomes.add("Filipe");
			nomes.add("Arian");
			nomes.add("Ana");
			nomes.add("Nicolas");
			nomes.add("Henrrique");
			
			for(int i = 0; i < 1; i++ ) {
				System.out.println("O nome sorteado é: " + nomes.get(sorteio.nextInt(nomes.size())));
				
			}
	}
}
