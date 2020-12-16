# 1
- Não, o problema não tem a ver com a variável inteira, pois, como não foi atribuído um valor a ela, o java atribui zero. O problema que será gerado diz respeito a classe não ter sido instanciada, logo, não tem como ser executada. Após criar um objeto (exemplo: obj_hotel.java) o erro de compilação não existirá.

# 2
- O resultado será erro, pois, está sendo passado um parâmetro (2) para o construtor, e ele não está definido desta forma na classe hotel.

# 3
- O resultado vai ser zero,pois, o print está solicitando a impressão de ‘int A’ que não foi inicializada e recebe int zero por padrão. Para imprimir a soma e exibir o resultado, é necessário retirar o ‘’this’’. deixando assim:
System.out.print(a);


# 4
- O problema é que a classe não foi declarada , só tem o método. Para solucionar poderia utilizar ex:public class Cls_quatro. 
Outro problema é que como o método foi declarado como void, o resultado do método não está acessível. Poderia ser retirado o void e usado um return.
Ou deixado o void e utilizado um print(resultado) no fim do método.

# 5
-primeiro erro
A classe TestaRadio está atribuindo um valor para o volume, sendo que já existe um método para isso (Radio()), então podemos resolver utilizando: r.Radio(10)
segundo erro
Ao fazermos isso, ainda sim retornará erro, pois, o método Radio() não está informando o tipo de retorno. Podemos defini lo com void Radio(int volume)
feita essas duas correções o código já retorna o valor adequado
