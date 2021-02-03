package br.edu.ifpi.poo.banco.cadastros;

import br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import br.edu.ifpi.poo.banco.entidade.Conta;
import br.edu.ifpi.poo.banco.entidade.Poupanca;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}

	public void inserir(Conta c) {
// Questão 3
		if (indice >= contas.length) { 
			throw new AplicacaoException("Limite de contas excedido"); //lançamento de excessão
		} 
		contas[indice] = c;
		indice++;
	}
//Questao 1
	public Conta consultar(String numero){
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				c = contas[i];
				return c;
			}
		} 
		throw new AplicacaoException("Esta conta não foi encontrada"); //lançamento de excessão
		}
	

	private int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].getNumero().equals(numero)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c == null) {
			throw new AplicacaoException("Conta inexistente.");
		}
		
		c.sacar(valor);
	}
//Questao 2
	public void creditar(String numero, double valor) {
		Conta c;
		try {
			c = consultar(numero);
			c.depositar(valor);
		}
		catch (AplicacaoException e) {
			System.out.println("Conta inexistente.");
		}
	}
	//Questão 2
	public void transferir(String numCredito, String numDebito, double valor) {
		try{
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);
		contaCredito.transferir(contaDebito, valor);
		}
		catch (AplicacaoException e){
			System.out.println(e.getMessage());
		}
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.getNumero());
		if (indice != -1) {
			contas[indice] = c;
		}

	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice; i++) {
				contas[i] = contas[i + 1];
			}

			indice--;
		}
	}
	//Questão 8
	public void renderJuros(String numero) {
		try{
		Conta c = consultar(numero);
		if (!(c instanceof  Poupanca)) {
			throw new RuntimeException("Erro. A conta precisa ser poupança");
		}
			System.out.println("encontrada");
			((Poupanca) c).renderJuros();
		} else { // não entendi como retirar
			throw new AplicacaoException("Não encontrada");
		}
	}

	public int retornaQuantidade() {
		return indice;
	}
	
	public double retornaValorTotal() {
		double total = 0;
		for (int i = 0; i < indice; i++) {
			total += contas[i].getSaldo();
		}
		
		return total;
	}
	
	public double retornaMediaValores() {
		return retornaValorTotal()/retornaQuantidade();
	}
}