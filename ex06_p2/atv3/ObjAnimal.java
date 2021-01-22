public class ObjAnimal {
   public static void main(String[] args) {
      Animal a = new Bovino(); // mais comum seria animal a = new animal
      ((Bovino) a).setProducaoLeite(5); // usando cast
   }
}
