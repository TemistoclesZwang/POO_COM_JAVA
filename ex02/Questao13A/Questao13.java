public class Questao13 {
   int N = 26;

   boolean isPair(){
      if (N % 2 == 0) {
         return true;
      }else{
      return false;
      }
      
   }

   
   boolean isOdd(){
      if ( N % 2 != 0){
         return false;
      }else{
      return true;
      }
   }

   boolean isPrime(){
      for (int i = 2; i < N; i++) {
         if (N % i == 0){
            return false;
         } 
      } return false;
   }


}
