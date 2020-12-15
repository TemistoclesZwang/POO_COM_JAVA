public class Cls_quatro {

   void x(double valor) 
   {
      valor = valor + valor;
      System.out.println(valor);
   }

   public static void main(String[] args) {
      Cls_quatro somar = new Cls_quatro();
      somar.x(2.2);
      // System.out.println(somar);
   }
}