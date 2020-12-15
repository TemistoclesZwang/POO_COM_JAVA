//// Altere a classe conta dos slides conforme as instruções abaixo:
// a.Altere o método sacar de forma que eleretorneverdadeiro ou falso.
// Caso o saque deixe saldo negativo, o mesmo não será realizado, retornando falso;
// b.Altere   o  método  transferir()  para  que  o  mesmo  use  os  métodos  sacar()  e depositar().
// Visto  pelo prisma  da "proteção  do  saldo",  chamar  outros métodos em vez de acessar o saldo diretamente é mais seguro?
// c.Altere o método transferir() para que ele retorne também um valor lógico e que não seja feita a transferência caso o sacar() na conta origem não seja satisfeito;
// d.Verifique as diferentes operações implementadas na classe de testes



public class CLS_conta {
	String numero;
	private double saldo;
	
	CLS_conta(String numero, double valor) {
		this.numero = numero;
		this.saldo = valor;
	}

	boolean sacar(double valor) {
      saldo = saldo - valor;
      if (saldo > -1) {
         return true;
      } else {
         return false;
      }
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	void transferir(Conta destino, double valor) {

      this.sacar(valor);
      this.depositar(valor);
      
		//saldo = saldo - valor;
		//destino.saldo = destino.saldo + valor;
		this.sacar(valor);
		destino.depositar(valor);
	}		

}