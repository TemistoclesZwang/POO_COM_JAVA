## 4
- A - O problema é que o método que está tentando ser acessado (produção de leite)
não faz parte da classe Animal, e sim da Classe Bovino. Para resolver isso é necessário acessar
o método informando que ele é da classe Bovino utilizando cast:
((Bovino) a).setProducaoLeite(5)

B- não, pois todo peixe é animal, mas nem todo animal é um peixe. Quem herda as características da classe Animal é a classe Peixe. No exemplo mostrado está ao contrário

## 11
- V,F,V,V,V

## 12
- Está gerando uma instancia da Classe B, mesmo que o nome seja 'a' então
o resultado é: "metodo 1, classe B"

## 13
- O resultado vai ser erro. Na questão 12 funcionou,pois, o metodo1 classeB
estava sobrescrevendo o metodo1 da classe A. Já no método2 classe B, não tem um 
equivalente na classe A. Para aferir este fato, basta criarmos um método2 na classe A
que o código proposto irá funcionar normalmente

## 14
- Com a utilização da palavra reservada ''super'', esta sendo acessado o metodo1 da superclasse A. Logo, o resultado será: metodo1, classe A
## 16
- Não é compilável ,pois, está sendo feita uma sobrecarga de maneira incorreta.
os dois métodos precisam ter o mesmo nome , porém, com parâmetros diferentes.

## 17
- a sobrecarga está sendo feita com parâmetros iguais, eles precisam ser diferentes.



