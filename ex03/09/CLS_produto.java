public class CLS_produto {
   int codigo;
   String descricao;
   double valor;
   int quantidade;
   int quantidadeMinima;


   public CLS_produto(int cod, String desc, double vlr,int quan) {
      this.codigo = cod;
      this.descricao = desc;
      this.valor = vlr;
      this.quantidade = quan;
   }

   public void baixar(int quantidade) {
      if (this.quantidade-- > this.quantidadeMinima) {
         this.quantidade--;
         System.out.println("Valor diminuído.");
      }else{
         System.out.println("Ação não permitida. A operação deixou a quantidade a baixo da minima.");
      }
   }
   public void repor(int quantidade) {
      System.out.println("Valor aumentado.");
      this.quantidade++;
   }

   public void reajusta(double taxa) {
      this.valor = (this.valor / 100) * taxa;
      System.out.println("Valor reajustado em: " + this.valor);

   }

   public String toString() {
      
      // return this.descricao;
      // Integer.toString(this.codigo);
      // String.valueOf(this.valor);
      return Integer.toString(this.quantidade);
      // Integer.toString(this.quantidadeMinima);
   }

}
