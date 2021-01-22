
public class TestaBanco {
	public static void main(String[] args) {
		Banco banco = new Banco(10);
		Conta c1 = new Conta("1", 500);
		banco.inserir(c1);
		if (banco.consultar("2") == null) {
			banco.inserir(new Conta("2",1000));
		}
		
		if (banco.consultar("2") != null) {
			System.out.println("A conta 2 já está cadastrada.");
		}
		
		System.out.println(banco.consultarIndice("2"));
		System.out.println(banco.consultarIndice("3"));
		
 		Conta c2x = new Conta("2", 1000000);
		banco.alterar(c2x);
/*		
		Conta c3 = new Conta("3", 1000000);
		banco.alterar(c3);
	*/	
		banco.excluir("1");
  		Conta c3 = new Conta("3", 1000000);
		banco.inserir(c3);
		banco.debitar("2", 20);
		banco.debitar("4", 20);
	}
}
