//Crie uma classe Equipamento com:
// a.um atributo ligado (tipo boolean) 
// b.dois métodos liga() e desliga(). O método liga torna o atributo ligado true e o método desliga torna o atributo ligado false.
// c.Crie  um  método  chamado  inverte(),  que  muda  o  status  atual  (se  ligado, desliga...se desligado, liga)
// d.Crie um método que esta Ligado() que retorna o valor do atributo ligado 
// e.Altere  o  comportamendo  dos  métodos  liga  para  caso  o  equipamento  já esteja ligado, não ligue novamente. Faça o mesmo com o método desligar

public class Questao14 {
   boolean ligado = false;

   
   boolean liga(){
      boolean status = ligado();
      if (status == false) {
         return ligado = true;
      } else{
         return ligado = false;
      }
      
   }
   boolean desliga(){
      boolean status = ligado();
      if (status == true) {
         return ligado = false;
      }else{
         return ligado = true;
      }
      
   }
   boolean inverte(){
      if (ligado == true) {
         return ligado = false;
      }else{
      return ligado = true;
      }
   }
   boolean ligado(){
      return ligado;
   }


}
