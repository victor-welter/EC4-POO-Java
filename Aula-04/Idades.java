/*
1) Elabore um algoritmo que leia a IDADE de 20 pessoas. Mostre a QUANTIDADE 
DE PESSOAS COM IDADE MAIOR OU IGUAL A 18. Mostre qual foi a MENOR 
IDADE lida. Mostre qual foi a MAIOR IDADE lida.
 */

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {

        Pessoas pessoa = new Pessoas();

        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Informe a idade da Pessoa " + i + ": ");
                int idade = scanner.nextInt();

                pessoa.verificaIdade(i, idade);
            }

            System.out.println("Pessoa menor idade: " + pessoa.menorIdade);
            System.out.println("Pessoa maior idade: " + pessoa.maiorIdade);
            System.out.println("Total de maiores: " + pessoa.maiores);
        } finally {
            scanner.close();
        }
    }
}

class Pessoas {
    public int codigo;
    public int idade;
    public int maiorIdade;
    public int menorIdade;

    int maiores;

    void verificaIdade(int codigo, int idade) {
        if (idade >= 18) {
            maiores++;
        }

        if (idade > maiorIdade) {
            maiorIdade = idade;
        }

        if (menorIdade == 0) {
            menorIdade = idade;
        }

        if (idade < menorIdade) {
            menorIdade = idade;
        }
    }
}