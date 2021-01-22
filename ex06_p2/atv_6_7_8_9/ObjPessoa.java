public class ObjPessoa {
   public static void main(String[] args) {
      Funcionario p = new Funcionario();
      Professor prof = new Professor();
      Pessoa pessoa = new Pessoa();

//Pessoa
   pessoa.setNome("Raquel");
   pessoa.setSobreNome("Mendes");
   pessoa.getNomeCompleto();

//funcionario
      p.setSalario(998.5);
      p.setMatricula(8943);
      p.getMatricula();
      double primeira = p.getSalarioPrimeiraParcela();
      System.out.println("Resultado 60%: " + primeira);

//professor
      prof.setSalario(3000.9);
      double primeiraProf = prof.getSalarioPrimeiraParcela();
      prof.getSalarioSegundaParcela();
      prof.getTitulacao();
      prof.setTitulacao("Mestre");
      System.out.println("Resultado salário integral professor: " + primeiraProf);
      
   }
}
