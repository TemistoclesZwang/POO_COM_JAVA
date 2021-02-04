package atv7;

public class trapezio implements InterfaceFiguraGeometrica{
   double resultado;

   void calcTrapezio(double baseMaior, double baseMenor, double altura){
      double calcArea = (baseMaior+baseMenor)*altura/2;
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