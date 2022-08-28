/*
2) Elabore um algoritmo que leia um NÚMERO de 1 a 10, calcule e mostre a tabuada 
desse número.
 */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Numeros num = new Numeros();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe um número: ");
            int numIn = scanner.nextInt();

            if (numIn <= 10) {
                num.calculaTabuada(numIn);
            } else {
                System.out.println("Número inválido");
                System.out.println("Utilize números de 0 à 10");
            }

        } finally {
            scanner.close();
        }
    }
}

class Numeros {
    public int resultado;

    void calculaTabuada(int numero) {
        for (int i = 0; numero <= 10; i++) {

            resultado = numero * i;

            System.out.println(i + "x" + numero + " = " + resultado);

            if (i == 10) {
                break;
            }
        }
    }
}