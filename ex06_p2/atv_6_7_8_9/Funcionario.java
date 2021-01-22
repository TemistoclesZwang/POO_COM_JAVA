public class Funcionario extends Pessoa {
   private int matricula;
   private double salario;

   public int getMatricula() {
      return matricula;
   }

   public void setMatricula(int matricula) {
      this.matricula = matricula;
   }

   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }

   public double getSalarioPrimeiraParcela() {
      double calc = 0.6 * this.salario;
      return calc;
   }

   public double getSalarioSegundaParcela() {
      double calc = 0.4 * this.salario;
      return calc;
   }

}
