/*
4) Faça um algoritmo que receba vários NÚMEROS positivos. A condição para o 
programa parar de ler deve ser quando o NÚMERO LIDO FOR NEGATIVO. Calcule 
e mostre:
a) a soma dos números digitados;
b) a quantidade de números digitados;
c) a média dos números digitados;
*/

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int numeros;
            int soma = 0;
            int quantidade = 0;
            int media = 0;

            do {
                System.out.println("Informe os números: ");
                numeros = scanner.nextInt();

                soma += numeros;
                quantidade++;
            } while (numeros > 0);

            media = soma / quantidade;

            System.out.println("Soma: " + soma);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Média: " + media);

        } finally {
            scanner.close();
        }
    }
}
