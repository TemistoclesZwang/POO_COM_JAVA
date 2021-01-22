public class Professor extends Funcionario{
   private String titulacao;


   @Override
   public double getSalarioPrimeiraParcela() {
      return super.getSalario();
   }

   @Override
   public double getSalarioSegundaParcela() {
      return 0;
   }
   public String getTitulacao() {
      return titulacao;
   }
   public void setTitulacao(String titulacao) {
      this.titulacao = titulacao;
   }

}
