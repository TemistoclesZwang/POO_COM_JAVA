public class ObjFuncionario {
   public static void main(String[] args) {
      Funcionario gerente = new Gerente (5000); 
      Funcionario diretor = new Diretor (3000); 

      System.out.println("Salário do diretor: " + diretor.getBonificacao());
      System.out.println("Salário do gerente: " + gerente.getBonificacao());
   }
}
