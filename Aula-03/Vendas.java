/*
5. Um comerciante irá vender os produtos adquiridos com as seguintes margens comerciais:

a) 45% de lucro se o valor da compra for inferior a R$ 20,00
b) 35% de lucro se o valor da compra for maior ou igual a R$ 20,00 e menor do que R$ 
40,00
c) 25% de desconto se o valor da compra for maior ou igual a R$ 40,00 e menor do que 
R$ 60,00
d) 15% de lucro se o valor da compra for maior ou igual a R$ 60

Escreva um programa para ler o nome do produto e o valor de compra e informar o nome 
do produto e o valor de venda.
 */

import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {

        Produtos produto = new Produtos();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o nome do Produto: ");
            produto.nome = scanner.nextLine();

            System.out.println("Informe o valor do Produto: ");
            produto.valor = scanner.nextFloat();

            produto.margensComerciais();
        } finally {
            scanner.close();
        }
    }
}

class Produtos {
    String nome;
    float valor;

    void margensComerciais() {
        if (valor < 20) {
            valor += valor * 45 / 100;
        } else if (valor >= 20 && valor < 40) {
            valor += valor * 35 / 100;
        } else if (valor >= 40 && valor < 60) {
            valor += valor * 25 / 100;
        } else if (valor >= 60) {
            valor += valor * 15 / 100;
        }

        System.out.println(nome + ": R$ " + valor);
    }
}
