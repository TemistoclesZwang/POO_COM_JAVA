//Crie  uma classe chamada Descontoquetenha  como  atributos dois  valores referentes a um valor original de uma conta e um descontoem porcentagem. Crie um  método calcula()que  retorne um  valor  calculando  o  desconto  da seguinte forma: valorCalculado = valorOriginal * (1-desconto/100) .Ex: valor: 120 desconto: 10. Valor calculado: 108

public class Questao12 {
   int valor = 350;
   int desconto = 50;

   int calcula(){
      int valorCalculado = valor * (1 - desconto / 100);
      return valorCalculado;
   }

}
