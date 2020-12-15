public class Tres {
   int b = 1;
   int a;

   Tres(int a) {
      a = b + a;
      System.out.println(this.a);//imprimi o int a antes de receber o parametro do usuário
      System.out.println(a);//imprimi a variável A que faz a soma
   }

   public static void main(String args[]) {
      Tres t = new Tres(3);

   }
}