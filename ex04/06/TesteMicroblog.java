public class TesteMicroblog {
   public static void main(String[] args) {
      Microblog blog = new Microblog(5);
      Postagem post = new Postagem("Meu post");
      post.curtir();
      post.toString();
      blog.inserir(post);

   }
}
