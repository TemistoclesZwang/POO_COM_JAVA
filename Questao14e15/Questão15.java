//Crie uma classe chamada TestaEquipamentos e em seu método main:
// a.Instancie 2 objetos da classe Equipamento;
// b.Ligue o primeiro e desligue o segundo;
// c.Chame o método inverte() em cada um dos equipamentos;
// d.Faça  um ifpara  cada  um  dosequipamentos  testando  se  o  mesmo  está ligado. 
// Imprima: “ligado” ou “desligado” dependendo da situação de ambos;
public class Questão15 {
   public static void main(String[] args) {
      Questao14 eqp1 = new Questao14();
      Questao14 eqp2 = new Questao14();

      eqp1.liga();
      eqp1.inverte();

      eqp2.desliga();
      eqp2.inverte();

      if (eqp1.ligado() == true) {

         System.out.println("Ligado");
      }else{
         System.out.println("Desligado");
      }

      if (eqp2.ligado() == true) {

         System.out.println("Ligado");
      }else{
         System.out.println("Desligado");
      }
   }
}
