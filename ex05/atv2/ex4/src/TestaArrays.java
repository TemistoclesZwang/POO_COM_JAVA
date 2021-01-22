
public class TestaArrays {

	public static void main(String[] args) {
		/*
		int[] notas = new int[3];
		
		notas[0] = 7;
		notas[1] = 9;
		notas[2] = 8;
		

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		for (int i = notas.length-1; i >= 0; i--) {
			System.out.println(notas[i]);
		}
		
		int[] valores = {10,-1,3};
		System.out.println(valores[1]);
		
		for (int valor: valores) {
			System.out.println(valor);
		}
		
		
		String nome1 = "ely";
		String nome2 = "ely";
		if (nome1.equals(nome2)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		
		String s = "ely";
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(0));
		
		for (int i = 0; i< s.length(); i++) {
			System.out.print(s.charAt(i) + " ");
		}
		System.out.println("");
		String s2 = "         ely       " ;
		System.out.println(s2);
		System.out.println(s2.trim());
		*/
		
		Conta[] contas = new Conta[10];
		System.out.println(contas.length);
		
		Conta c1 = new Conta("1",500);
		contas[0] = c1;
		System.out.println(contas[0].numero);
		
	}

}
