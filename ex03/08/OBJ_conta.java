public class OBJ_conta {
      public static void main(String[] args) {
            CLS_conta c1 = new CLS_conta("1", 100);
            CLS_conta c2 = new CLS_conta("2", 100);

            c1 = c2;
            c1.sacar(10);
            c1.tranferir(c2, 5.0);
            System.out.println(c1.consultarSaldo());
            System.out.println(c2.consultarSaldo());
      }
}
