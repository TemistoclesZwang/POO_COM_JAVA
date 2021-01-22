public class Pessoa {
   private String nome;
   private String sobreNome;

   public Pessoa() {
      super();
   }
   public Pessoa(String nome, String sobrenome) {
      this.nome = nome;
      this.sobreNome = sobrenome;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setSobreNome(String sobreNome) {
      this.sobreNome = sobreNome;
   }
   public String getNome() {
      return nome;
   }
   public String getSobreNome() {
      return sobreNome;
   }
   public String getNomeCompleto() {
      return getNome() + getSobreNome();
   }
}
