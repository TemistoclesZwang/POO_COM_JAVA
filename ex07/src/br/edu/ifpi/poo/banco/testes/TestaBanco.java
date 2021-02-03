package br.edu.ifpi.poo.banco.testes;

import br.edu.ifpi.poo.banco.cadastros.Banco;
import br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import br.edu.ifpi.poo.banco.entidade.Conta;
import br.edu.ifpi.poo.banco.entidade.ContaImposto;
import br.edu.ifpi.poo.banco.entidade.Poupanca;

public class TestaBanco {
	public static void main(String[] args){
		Conta c = new Conta("1", 100);
		Banco b = new Banco();
		b.inserir(c);
		//1
		try { //tratamento de erro
		b.consultar("2");
		} catch (AplicacaoException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		}
	}

	// 	try {
	// 		c.sacar(10);
	// 		c.sacar(1000);
	// 		System.out.println("Esse c�digo n�o executa.");
			
	// 	} catch (AplicacaoException e) {
	// 		System.out.println("Exce��o capturada: " + e.getMessage());
	// 	}
	// 	System.out.println("Programa finalizado com sucesso");
	// }
// }
