public class Postagem {
   int id;
   String textoPostagem;
   int qtdCurtidas;

   public Postagem(String txt) {
      textoPostagem = txt;
   }

   // public void escrever(String txt){
   //    this.textoPostagem = txt;
   // }

   public void curtir() {
      qtdCurtidas++;
   }
   public String toString() {
      return "Quantidade curtidas = " + qtdCurtidas + "Postagem = " + textoPostagem;
   }
}
