//Crie  uma  classe chamada DecimalNumber que tenha  um  atributo double.  Esta classe deve ter dois métodos: um que exiba a parte inteira do atributo e outro que retorne parte decimal. Use cast
public class Questao11 {
   double dobro = 25.2;

   int inteira(){
      int parteInteira = (int) dobro;
      return parteInteira;
   }

   int decimal(){
      double dec = (int) dobro % 1;
      return (int) dec;
   }

}
