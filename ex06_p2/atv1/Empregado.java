

public class Empregado {
   private double salario = 500;

   
   public double calcularSalario() {
      return getSalario();
   }
   public void setSalario(double salario) {
      this.salario = salario;
   }
   public double getSalario() {
      return salario;
   }

}