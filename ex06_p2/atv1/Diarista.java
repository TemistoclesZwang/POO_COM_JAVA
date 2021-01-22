
public class Diarista extends Empregado{
   @Override
   public double calcularSalario(){
   double calc = super.calcularSalario() / 30; // super vai alterar o salario da conta Empregado
   return calc;
   }
}
