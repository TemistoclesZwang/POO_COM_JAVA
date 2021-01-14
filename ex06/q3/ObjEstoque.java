package q3;

public class ObjEstoque {
   public static void main(String[] args) {
      Estoque produto = new Estoque();

      produto.inserir("Feijão");
      produto.inserir("Macarrão");
      produto.inserir("Arroz");
      produto.consultar();
   }
}
