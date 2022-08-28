/*
3) Calcular o valor de bônus para os clientes de uma loja. 
a) Leia a quantidade de clientes para o qual será calculado o bônus.
b) Leia o VALOR DAS COMPRAS NO ANO ANTERIOR para cada cliente.
c) Calcule o valor em bônus para cada cliente conforme a regra: 7% de bônus 
para clientes cujo valor das compras for menor ou igual a R$ 1000,00 e 12% 
para os que tiver o valor das compras acima disso.
 */

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe a quantidade de clientes: ");
            int quant = scanner.nextInt();

            for (int i = 1; i <= quant; i++) {
                System.out.println("Informe o valor de compras do cliente " + i + ": ");
                float valor = scanner.nextFloat();

                if (valor <= 1000) {
                    valor = valor * 7 / 100;
                } else {
                    valor = valor * 12 / 100;
                }

                System.out.println("O cliente " + i + " tem R$" + valor + " de bônus");
            }
        } finally {
            scanner.close();
        }
    }
}
