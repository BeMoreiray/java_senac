package visao;

import java.util.List;
import java.util.Scanner;

import modelo.Carteira;

public class Tela {
	double saldo = 10.0;
	int resposta;
	String nome, senha, cpf;
	Carteira carteira = new Carteira();

	public Carteira cadastrar() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("------------CADASTRO-----------");
		System.out.println("Digite seu nome:");
		nome = teclado.next();
		System.out.println("Digite seu cpf: ");
		cpf = teclado.next();
		System.out.println("Digite sua senha: ");
		senha = teclado.next();

		carteira.setNome(nome);
		carteira.setSenha(senha);
		carteira.setCpf(cpf);

		carteira.setSaldo(saldo);
		return carteira;
	}

	public void consultarSaldo(List<Carteira> banco) {
		Scanner teclado = new Scanner(System.in);
		
		for (Carteira c : banco) {
			System.out.println("Digite sua senha:");
			senha = teclado.next();

			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();

			if (c.getSenha() == senha && c.getCpf() == cpf) {
				System.out.println(
						banco.indexOf(c) + " -> Seus dados: Nome = " + c.getNome() + ", saldo = R$ " + c.getSaldo());
			}
		}
	}

	public void depositar(List<Carteira> banco) {
		for (Carteira c : banco) {
			Scanner teclado = new Scanner(System.in);

			double saldo2;
			double somaSaldo;

			System.out.println("Digite sua senha:");
			senha = teclado.next();

			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();

			if (c.getSenha() == senha && c.getCpf() == cpf) {
				System.out.println(
						banco.indexOf(c) + " -> Seus dados: Nome = " + c.getNome() + ", saldo = R$ " + c.getSaldo());
				System.out.println("Qual valor você deseja adicionar a sua conta? ");
				saldo2 = teclado.nextDouble();

				somaSaldo = saldo2 + c.getSaldo();
				System.out.println("Seu saldo é: R$ " + somaSaldo);

				c.setSaldo(somaSaldo);

			}
		}
	}

	public void sacar(List<Carteira> banco) {
		for (Carteira c : banco) {
			double valor;
			Scanner teclado = new Scanner(System.in);

			System.out.println("Digite sua senha:");
			senha = teclado.next();

			System.out.println("Qual é o seu CPF?");
			cpf = teclado.next();
			if (c.getSenha() == senha && c.getCpf() == cpf) {

				System.out.println(
						banco.indexOf(c) + " -> Seus dados: Nome = " + c.getNome() + ", saldo = R$ " + c.getSaldo());
				System.out.println("Quanto você deseja sacar?");
				valor = teclado.nextDouble();
				if (valor > c.getSaldo()) {
					System.out.println("Saldo insuficiente para saque!");

				} else {
					double subSaldo;
					subSaldo = (c.getSaldo() - valor);
					System.out.println(subSaldo);

					c.setSaldo(subSaldo);

				}
			}
		}
	}
}
