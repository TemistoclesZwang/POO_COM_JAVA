public class obj_jogador {
   public static void main(String[] args) {
      cls_jogador J1 = new cls_jogador(10,4,9);
      cls_jogador J2 = new cls_jogador(20,5,6);

      // J1.pontos_relativos();
      // J2.pontos_relativos();

      J2.atacar(J1);
      
   }
}
