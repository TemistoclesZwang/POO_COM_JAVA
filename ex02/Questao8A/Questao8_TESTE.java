//Crie  uma  classe TestaSaudacao para  testar  a  classe Saudacao.  Nela  crie  um método  main()  que  instancie  um  objeto  do  tipo Saudacaoe  inicialize  os  dois atributos. Após isso, exiba (println) o resultado do métodoobterSaudacao().
public class Questao8_TESTE {
   public static void main(String[] args) {
      Questao7 saudacao = new Questao7();
      saudacao.destinatario = "Professor";
      saudacao.texto = "Olá";
      System.out.println(saudacao.obterSaudacao());
   }
}
