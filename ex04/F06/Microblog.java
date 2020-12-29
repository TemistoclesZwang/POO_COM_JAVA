public class Microblog {
   Postagem[] postagens;
   int indice = 0;

   public Microblog() { 
      postagens = new Postagem[50];
   }
   public Microblog(int tamanho) { // construtor para limitar o tamanho do array
      postagens = new Postagem[tamanho];
   }

   public void inserir(Postagem p) {
      postagens[indice] = p;
      indice++;
      System.out.println(postagens[indice]);
   }
   }

