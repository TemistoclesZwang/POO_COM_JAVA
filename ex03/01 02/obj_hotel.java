
// public class obj_hotel {
//    public static void main(String[] args) {
//       class_hotel h = new class_hotel();
//       h.adicionarReserva();
//       h.mostrar_reservas();
//    }

// }

public class obj_hotel {
   public static void main(String args[]) {
      class_hotel hotel = new class_hotel(2);
      System.out.print(hotel.quantReservas);
   }
}