package br.edu.ifpi.poo.banco.entidade;

public class Conta {
	private String numero;
	private double saldo;

	public Conta(String numero, double valor) {
		this.numero = numero;
		this.depositar(valor);
	}
//Questão 5
	public void sacar(double valor) {
		try{
		if (saldo < valor) {
			throw new AplicacaoException("Seu saldo não é suficiente.");
		}
		if(valor <= 0 ){
			throw new AplicacaoException("Seu valor é menor ou igual a zero.\n");
		}
		saldo = saldo - valor;
	}
	catch (AplicacaoException e) {
		System.out.println("Excessão: " + e.getMessage());
	}
//Questao 4
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new AplicacaoException("Esse valor é inválido"); //lançamento de excessão
		}
		saldo = saldo + valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}

	public String getNumero() {
		return numero;
	}

}
