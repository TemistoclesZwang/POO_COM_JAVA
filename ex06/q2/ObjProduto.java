package q2;

public class ObjProduto {

   public static void main(String[] args) {
      ProdutoPerecivel p = new ProdutoPerecivel();
      p.setEstoque(25);
      p.darBaixa(10);
      System.out.println(p.getEstoque());
      p.setValidade("20200115");
      System.out.println(p.getValidade());
   }
}