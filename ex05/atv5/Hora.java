package atv5;

public class Hora {
private int hora;
private int minuto;
private int segundo;


public Hora(int hora,int minuto,int segundo) {
   // ler seria um input? ou ler seria um get()?
   this.setHora(hora);
   this.setMinuto(minuto);
   this.setSegundo(segundo);
}
public int lerHora() {
   return this.getHora();
}
public int lerMinuto() {
   return this.getMinuto();
}
public int lerSegundo() {
   return this.getSegundo();
}

public void imprimirHora() {
   System.out.print(lerHora());
   System.out.print(":");

   System.out.print(lerMinuto());
   System.out.print(":");

   System.out.print(lerSegundo());
   System.out.println("\n");
}
public int getHora() {
   return hora;
}
public void setHora(int hora) {
   this.hora = hora;
}
public int getMinuto() {
   return minuto;
}
public void setMinuto(int minuto) {
   this.minuto = minuto;
}
public int getSegundo() {
   return segundo;
}
public void setSegundo(int segundo) {
   this.segundo = segundo;
}



}
