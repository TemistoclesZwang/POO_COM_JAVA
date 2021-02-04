public class circulo extends FiguraGeometrica {
   double resultado;

   void calcCirculo(int raio, int grau) {
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