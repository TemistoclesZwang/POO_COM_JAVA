//Crie uma classe Calculadora que tenha 
// dois atributos privados (operando1 e 2) e:
// a.Crie 2 métodos públicos, cada um representando uma operação básica;
// b.Crie um construtor onde são passados os operandos;
// c.Crie uma classe que teste a classe calculadora. Tente acessar os atributos diretamenteeverifique o que acontece.


public class Calculadora {

   private int op1;
   private int op2;

public Calculadora(int op1,int op2) {
   this.setOp1(op1);
   this.setOp2(op2);
}
   
public void somar() {
   int somar = this.getOp1() + this.getOp2();
   System.out.println("Resultado: " + somar);
}
public void subtrair() {
   int subtrair = this.getOp1() - this.getOp2();
   System.out.println("Resultado: " + subtrair);
}

public float divisao() {
   int dividir = this.getOp1() / this.getOp2();
   System.out.println("Resultado: " + dividir);
   return dividir;
}
public int getOp1() {
   return op1;
}
public void setOp1(int op1) {
   this.op1 = op1;
}
public int getOp2() {
   return op2;
}
public void setOp2(int op2) {
   this.op2 = op2;
}

}