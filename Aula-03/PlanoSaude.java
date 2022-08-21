/*
6. Escreva um programa para ler o nome e a idade de uma pessoa e imprimir o nome e o valor 
que ela terá que pagar por um plano de saúde. O programa deverá levar em consideração a 
tabela abaixo:

* I. até 10 anos - R$ 30,00
* II. acima de 10 até 29 anos - R$ 60,00
* III. acima de 29 até 45 anos - R$ 120,00
* IV. acima de 45 até 59 anos - R$ 150,00
* V. acima de 59 até 65 anos - R$ 250,00
* VI. acima de 65 anos - R$ 400,00
 */

import java.util.Scanner;

public class PlanoSaude {
    public static void main(String[] args) {

        Pessoas pessoa = new Pessoas();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o nome da Pessoa: ");
            pessoa.nome = scanner.nextLine();

            System.out.println("Informe a idade da Pessoa: ");
            pessoa.idade = scanner.nextInt();

            pessoa.valorPlanoSaude();
        } finally {
            scanner.close();
        }
    }
}

class Pessoas {
    String nome;
    int idade;
    double valorPlano;

    void valorPlanoSaude() {
        if (idade <= 10) {
            valorPlano = 30.00;
        } else if (idade > 10 && idade <= 29) {
            valorPlano = 60.00;
        } else if (idade > 29 && idade <= 45) {
            valorPlano = 120.00;
        } else if (idade > 45 && idade <= 59) {
            valorPlano = 150.00;
        } else if (idade > 59 && idade <= 65) {
            valorPlano = 250.00;
        } else if (idade > 65) {
            valorPlano = 400.00;
        }

        System.out.println("Olá " + nome + ", o valor do seu plano de saúde é de R$ " + valorPlano);
    }
}