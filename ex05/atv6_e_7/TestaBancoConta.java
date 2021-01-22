package atv6_e_7;

public class TestaBancoConta {
	public static void main(String[] args) {
		Banco banco = new Banco(10);
		Conta c1 = new Conta("1", 500);
		banco.inserir(c1);

		if (banco.consultar("2") == null) {
			banco.inserir(new Conta("2",1000));
		}
		c1.sacar(29.9);
		banco.excluir("1");
// testando as modificações do exercicio 7
	}
}
