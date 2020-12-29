public class Senha {
   String valor = "123456";
//a
   public void iguais(String senha) {
      if (valor.equals(senha)) {
         System.out.println("Iguais");
      } else {
         System.out.println("Diferentes");
      }
   }
//b
   public void iguaisTrim(String senha) {
      if (valor.trim().equals(senha.trim())) {
         System.out.println("Iguais");
      } else 
      {
         System.out.println("Diferentes");
      }
   }
   //c
   public boolean tamanhoSeguro(String senha) {
      if (senha.length() == 6){
      return true;
      } else{
         return false;
      }
   }
   //d
   public boolean possuiMaiusculaMinuscula(String senha) {

      boolean minu = false;
      boolean maiu = false;

      for (int i = 0; i < senha.length(); i++) {

         int tabelaAscii = senha.charAt(i);// transformar o que estiver na posição i

         if (tabelaAscii >= 97 && tabelaAscii <= 122) {
            minu = true;
            // System.out.println("Minúscula " + senha.charAt(i) ); 
            //senha.charAt(i) pegar posição do caracteres na posição i
         } else if (tabelaAscii >= 65 && tabelaAscii <= 90){
            maiu = true;
            // System.out.println("Maiúscula " + senha.charAt(i) );
         }
            
         }
         if (minu == true && maiu == true){
            return true;
            
         }else{
            return false;
         }
      }
   //e
   public boolean possuiNumero(String senha) {

      for (int i = 0; i < senha.length(); i++) {
         int tabelaAscii = senha.charAt(i);
         
         if (tabelaAscii >= 48 && tabelaAscii <= 57) {
            return true; // verifica todos char. se tiver número retorna true
         }
      }
      return false; // depois de verificar todos char se não tiver número só resta retornar false
   }
   
   public boolean ehValida() {
   //como acessar o retorno dos métodos em outro método ?
      }
   }

