package aula003;

public class AppMatriz {

	public static void main(String[] args) {
		Pelicano[] filhotes = new Pelicano[3];

		//atribui��o de quantos espa�os ter� no array
		//OBS: seu array pode ter quantos espa�os vc desejar, mas isso tudo depende do espa�o RAM da sua m�quina.
		 
		
		Pelicano p1 = new Pelicano();  //Para vc adicionar uma vaiavel a um espa�o no seu array, vc precisa declarar a variavel antes.
		Pelicano p2 = new Pelicano();
		
		//atribui��o de valor a variavel
		p1.setCor("branco");
		p2.setPeso(10);
		p2.setCor("marrom");
		filhotes[2].setCor("preto");
		filhotes[2].setPeso(90);
		
		
		//adi��o de variavel ao espa�o no array.
		filhotes[0] = p1;
		filhotes[1] = p2;
		filhotes[2] = new Pelicano();
		
		
		
    System.out.println(filhotes[0].getCor());
    System.out.println(filhotes[1].getPeso());
    System.out.println(filhotes[1].getCor());
    
   
    filhotes[2].voar();
    
    
    
    for(Pelicano exemplo: filhotes) {
    	System.out.println("O pelicano tem a cor: " +exemplo.getCor());
    }
}

}
