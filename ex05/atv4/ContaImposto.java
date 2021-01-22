package atv4;


//a
public class ContaImposto {
   
   private double saldo;
   private int numero;


//c
public ContaImposto(int num,double sald) {
   this.setNumero(num);
   this.setSaldo(sald);
}

//d
public void credito(double valor) {
   this.setSaldo(valor + getSaldo()); 
   System.out.printf("Resultado: %.2f" , this.getSaldo());

}
public void debito(double valor) {
   double retirar038 = valor - retemImposto(valor);
   this.setSaldo(this.getSaldo()-retirar038);
   System.out.printf("Resultado: %.2f\n" , this.getSaldo());
}


//e
private double retemImposto(double valorDebito) {
   return valorDebito * (0.38 / 100); //retira 0,38 do parametro
   
}

public int getNumero() {
   return numero;
}
public void setNumero(int numero) {
   this.numero = numero;
}

//b
public double getSaldo() {
   return saldo;
}
public void setSaldo(double saldo) {
   this.saldo = saldo;
}

}
