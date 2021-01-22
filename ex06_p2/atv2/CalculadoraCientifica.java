
import java.lang.Math; 

public class CalculadoraCientifica extends Calculadora{
   public CalculadoraCientifica(int op1, int op2) {
		super(op1, op2);
		//TODO Auto-generated constructor stub
	}

   public double exponenciar(int base, int expoente) {
         return Math.pow(base,expoente);
      }

   @Override
   public  divisao(boolean valor){
   if (valor){
   float div = super.divisao(); // usa a divisão da class Calculadora.java que retorna float
   int arredondar = Math.round(div);
   return arredondar;
   }else{
      return div;
   }
   }


}
