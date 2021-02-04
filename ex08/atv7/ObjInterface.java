package atv7;

public class ObjInterface {
   public static void main(String[] args) {
      circulo circulo = new circulo();
      losango losango = new losango();
      trapezio trapezio = new trapezio();
      circulo.calcCirculo(14,4);
      losango.calcLosango(11,8);
      trapezio.calcTrapezio(5,5,4);

      System.out.println("Resultado circulo: " + circulo.area());
      System.out.println("Resultado losango: " + losango.area());
      System.out.println("Resultado trapezio: " + trapezio.area());
   }
}
