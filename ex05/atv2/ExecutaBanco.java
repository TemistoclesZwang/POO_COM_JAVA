package atv2;
import java.util.Scanner;

public class ExecutaBanco {
   public static void main(String[] args) {
   Banco b = new Banco();
   Scanner sc = new Scanner(System.in);
   String opcao = "";
   do{
      System.out.println("1-Cadastrar  2-Alterar  3-Excluir 4 -Transferir... 9-Sair");
   opcao = sc.next();

   switch (opcao) {
      case "1": Conta c = new Conta();
         System.out.println("Digite o número");
         c.numero = sc.next();
         System.out.println("Digite o valor do saldo");
         c.saldo = sc.nextDouble();
         b.inserir(c);
         break;

      case "2": 
      if (b.indice > 0) { // ou seja se alguma conta já foi criada
         System.out.println("Insira o numero da conta que quer alterar: ");
         int posicao = b.consultarIndice(sc.next());
         System.out.println("Alterado número: " + b.contas[posicao].numero);
         b.contas[posicao].numero = "255";//Acessa o array contas na posicao X item numero
         System.out.println("Para número: " + b.contas[posicao].numero);

      } if (b.indice <= 0) {
         System.out.println("Você precisa cadastrar uma conta primeiro\n");
         
      }
      case "3":
      System.out.println("Insira o numero da conta que quer excluir: ");
      b.excluir(sc.next());
      // System.out.println("Digite o número para alterar");
      
      case "4":
      if (b.indice >= 1) { //é necessário existir mais de duas contas para transferir
      int posicao = b.consultarIndice(sc.next());
      c.transferir(Conta aqui, sc.nextDouble());
      }else{
         System.out.println("É necessário a criação de uma conta de origem e uma para transferir");
         FIXME:
      }
   }
} while(!opcao.equals("9") );
}
}












// switch(opcao) {
//    "1": Conta c = new Conta("123",29.99);
//    System.out.println("Digite o número");
//    c.numero = sc.next();
//    c.saldo = sc.nextDouble();
//    b.inserir(c);
//    break;
//    "2": //...
//    }