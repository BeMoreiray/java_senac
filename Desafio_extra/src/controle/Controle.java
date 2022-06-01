package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.Carteira;

import visao.Tela;

public class Controle {
	
	List<Carteira> banco = new ArrayList<Carteira>();
	public void avaliarOpcao(int resposta){
		Tela tela = new Tela();
		
	
	if(resposta == 1) {
		
        banco.add(tela.cadastrar());
	}else if(resposta == 2) {
		
		tela.consultarSaldo(banco);	
	}else if(resposta == 3) {
		tela.depositar(banco);
		
	}else if(resposta == 4) {
		tela.sacar(banco);

		
		}
	}
}
