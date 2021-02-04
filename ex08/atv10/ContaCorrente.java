package atv10;

public class ContaCorrente extends Conta implements interfaceTributavel{
// Sei nem se pode extender e implementar ao mesmo tempo. 
//Se tiver errado desculpa professor kkkkk

   @Override
   public double calculaTributos() {
      // TODO Auto-generated method stub
      return 10;
   }
   
}
