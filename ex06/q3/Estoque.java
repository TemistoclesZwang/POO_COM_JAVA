package q3;

import java.util.ArrayList;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Estoque extends Produto{
   ArrayList<String> novoEstoque = new ArrayList();

public void inserir(String nome) {
   novoEstoque.add(nome);
}
public void status() {
   System.out.println(novoEstoque);
   
}

public void consultar() {
   int posicoes;
   int n = novoEstoque.size();
   for (posicoes=0; posicoes<n; posicoes++) {
   System.out.printf("\nOpção %d- %s\n", posicoes, novoEstoque.get(posicoes));
   }

   System.out.printf("\nEscolha uma das opções para excluir e utilize como parâmetro para o método Excluir(opção):\n");

}
public void excluir(int opcao) {
   novoEstoque.remove(opcao);
   System.out.printf("\nProduto exluído, está é a lista atualizada: \n");
   this.status();
}

}
