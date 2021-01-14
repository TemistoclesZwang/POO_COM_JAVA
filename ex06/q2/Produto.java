public class Produto {
   private String id;
   private String descricao;
   private int quantidade;
   private float valor;
   private int estoque;

   public void repor(int item) {
      this.estoque += item;
   }
   public void darBaixa(int item){
      this.estoque -= item;
   }

   public void setEstoque(int estoque) {
      this.estoque = estoque;
   }
   public int getEstoque() {
      return estoque;
   }
   public String getDescricao() {
      return descricao;
   }
   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public int getQuantidade() {
      return quantidade;
   }
   public void setQuantidade(int quantidade) {
      this.quantidade = quantidade;
   }
   public float getValor() {
      return valor;
   }
   public void setValor(float valor) {
      this.valor = valor;
   }


}
