public class ObjPilha {
   public static void main(String[] args) {
      Pilha p = new Pilha();
      p.empilhar(3);
      p.empilhar(6);
      p.empilhar(9);
      p.empilhar(91);
      p.empilhar(39);
      System.out.println(p.estaCheia());


   }
}
