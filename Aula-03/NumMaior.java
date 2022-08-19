/*
2. Faça um algoritmo que leia 4 NÚMEROS e mostre o MAIOR deles.
 */

import java.util.Scanner;

public class NumMaior {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Numeros num = new Numeros();

            int[] numeros = new int[4];

            System.out.println("Informe  4 números:");
            System.out.println("Primeiro número:");
            numeros[0] = scanner.nextInt();

            System.out.println("Segundo número:");
            numeros[1] = scanner.nextInt();

            System.out.println("Terceiro número:");
            numeros[2] = scanner.nextInt();

            System.out.println("Quarto número:");
            numeros[3] = scanner.nextInt();

            num.verificaNumeros(numeros);

        } finally {
            scanner.close();
        }
    }
}

class Numeros {
    void verificaNumeros(int[] numeros) {
        int maior = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número informado é " + maior);
    }
}
