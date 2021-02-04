package atv7;

public class circulo implements InterfaceFiguraGeometrica {
   double resultado;

   void calcCirculo(double raio, double grau) {
      double calcArea = grau * raio * raio * 3.14 / 360;
      this.resultado = calcArea;
   }

   @Override
   public double perimetro() {
      return 0;
   }

   @Override
   public double area() {
      return resultado;
   }
}