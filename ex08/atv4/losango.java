public class losango extends FiguraGeometrica{
   double resultado;

   void calcLosango(double diagonal1,double diagonal2){
      double calcArea =   diagonal1 * diagonal2/2;
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
