// a.Crie 3 atributos inteiros representando força, nível e pontos atuais;
// b.Crie  um  construtor  no  qual  os  3  parâmetros  são  passados  e  inicialize  os respectivos atributos;
// c.Crie  um  método  que  calcule  os  pontos  relativos  a  um  ataque  que  são calculados pela multiplicação de força pelo nível;

// d.Crie um método chamado atacar em que é passado um outro jogador como parâmetro  
// e  é  feita  a  subtração  de  pontos  de  tal  jogador  baseado  na quantidade de pontos do jogador atual (“this”).

// e.Avalie em uma classe de testes dois jogadores instanciados e inicializados através  do  construtor.  
// Nessa  classe,  utilize  o  método  de  ataque  de  cada jogador e ao final, verifique qual jogador tem mais pontos.

public class cls_jogador {
   int forca;
   int nivel;
   int pontos;

   public cls_jogador(int F,int N, int P) {
      this.forca = F;
      this.nivel = N;
      this.pontos = P;
   }

   public int pontos_relativos(){
      int calcPontos = this.forca * this.nivel;
      // System.out.println(calcPontos);
      return calcPontos;
   }


   public void atacar(cls_jogador outroJogador){
      
      outroJogador.pontos -= this.pontos_relativos();
      System.out.println(outroJogador.pontos);

      //subtrarir pts j1 pelo j2

   }

   
}
