public class Q2 {
   public static void main(String[] args) {
      
      Conta[] contas = new Conta[5];
      Conta c = new Conta("2",400); //solução
      contas[0] = c; //solução
      contas[0].saldo=10;
      System.out.println(contas[0].saldo);
      


      // O primeiro erro é que ele estava utilizando uma classe que não foi definida(Conta) depois de definir ela e colocar na mesma pasta, ocorre o erro de Null pointer, pois, o objeto que contas aponta está ''null''.Por isso é sempre necessário instanciar uma conta com um objeto que esteja dentro do array.
   }
}
