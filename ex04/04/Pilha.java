public class Pilha {
   // int[] notas = {1,3,5,7};
   int[] arrayP = new int[5];
   int posicao = arrayP.length - 1; //inserir numero no fim do array
   int flag = 0;

      public void empilhar(int numero) {
         arrayP[posicao] = numero;
         posicao--; // para recuar uma posicao
         flag++; // marcar entradas dos numeros no array
      }
      public boolean estaCheia() {
         if (flag < arrayP.length){
            return false;
         } else if (flag == arrayP.length){
            return true;
         }
         return false;
      }
      public void desempilhar() {
         System.out.println("Ultimo: " + arrayP[arrayP.length-1]);
      }
      public void retornaTopo() {
         System.out.println("Topo da pilha: " + arrayP[posicao + 1]
         );
      }
      public void exibir() {
         System.out.println("Pilha: " );
         for (int i = flag - 1; i <= arrayP.length - 1; i++) {//para exibir somente os números adcionados e ignorar os zero
            System.out.println(arrayP[i]);
            
         }
      }


      }