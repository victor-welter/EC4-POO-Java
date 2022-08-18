/*
1. Os triângulos podem ser classificados em equilátero, isósceles e escalenos, de acordo com 
as medidas dos seus lados. Sendo que cada tipo possui características especificas.
 
* EQUILÁTERO =  Os três lados apresentam medidas iguais.
* ISÓCELES =  Dois lados apresentam medidas iguais.
* ESCALENO =   Os três lados apresentam medidas diferentes

- Elabore um algoritmo que:
1) Leia os valores para os lados de um triângulo: A, B e C.
2) Para que as medidas fornecidas caracterizem um triângulo, cada um dos lados deve ser 
menor que a soma dos outros dois lados, caso os lados fornecidos não caracterizem um 
triângulo, escreva: “As medidas informadas não caracterizam um triângulo”.
3) Testar os valores conforme as características de cada tipo de triângulo (mostrado no 
quadro) e classificá-lo conforme o tipo. Escreva o tipo de triângulo na tela.
 */

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            TiposTriangulos tiposTriangulos = new TiposTriangulos();

            System.out.println("Informe o lado A: ");
            int ladoA = scanner.nextInt();

            System.out.println("Informe o lado B: ");
            int ladoB = scanner.nextInt();

            System.out.println("Informe o lado C: ");
            int ladoC = scanner.nextInt();

            tiposTriangulos.defineTriangulo(ladoA, ladoB, ladoC);

        } finally {
            scanner.close();
        }

    }

}

class TiposTriangulos {
    void defineTriangulo(int ladoA, int ladoB, int ladoC) {
        int somaAB = ladoA + ladoB;
        int somaBC = ladoB + ladoC;
        int somaCA = ladoC + ladoA;

        if ((ladoA < somaBC) && (ladoB < somaCA) && (ladoC < somaAB)) {
            if ((ladoA == ladoB) && (ladoA == ladoC)) {
                System.out.println("Triângulo EQUILÁTERO!");
            } else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
                System.out.println("Triângulo ISÓCELES!");
            } else {
                System.out.println("Triângulo ESCALENO!");
            }
        } else {
            System.err.println("As medidas informadas não caracterizam um triângulo!");
        }
    }
}
