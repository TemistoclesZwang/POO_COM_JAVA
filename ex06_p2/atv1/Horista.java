public class Horista extends Diarista{
   @Override
   public double calcularSalario() {
      double calc = super.calcularSalario() / 24; // super vai alterar o salario da conta Empregado
      return calc;
   }
}
