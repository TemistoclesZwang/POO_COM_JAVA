package atv6_e_7;

public class Conta {
	private String numero;
	private double saldo;
	
	Conta(String numero, double valor) {
		this.numero = numero;
		this.saldo = valor;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
		System.out.println("Sacado com sucesso");
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void transferir(Conta destino, double valor) {
		saldo = saldo - valor;
		destino.saldo = destino.saldo + valor;
		//this.sacar(valor);
		//destino.depositar(valor);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
