/*
3. Um banco irá conceder CRÉDITO especial aos seus clientes. Este crédito é concedido de 
acordo com o SALDO MÉDIO do trimestre. Faça um algoritmo que:

* 0 à 500 = Nenhum crédito
* 501 à 1000 = 15% sobre o valor do saldo médio
* 1001 à 1500 = 25% sobre o valor do saldo médio
* Acima de 1501 = 50% sobre o valor do saldo médio

1) leia o saldo para cada mês de apuração (três meses)
2) calcule o SALDO MÉDIO do cliente
3) calcule o VALOR DO CRÉDITO de acordo com a tabela abaixo
4) mostre uma mensagem informando o saldo médio e o valor do crédito.
 */

import java.util.Scanner;

public class CreditoEspecial {
    public static void main(String[] args) {

        CalculaCredito cal = new CalculaCredito();

        Scanner scanner = new Scanner(System.in);

        try {
            long[] saldos = new long[3];

            for (int i = 0; i < 3; i++) {
                int mes = i + 1;

                System.out.println("Mês  " + mes + ": ");
                saldos[i] = scanner.nextLong();

            }

            cal.calculateCredito(saldos);
        } finally {
            scanner.close();

        }
    }
}

class CalculaCredito {
    void calculateCredito(long[] saldos) {
        long soma = 0;

        for (long valor : saldos) {
            soma += valor;
        }

        long saldoMedio = soma / saldos.length;

        if (saldoMedio > 1501) {
            System.out.println("Valor do crédito:" + (saldoMedio * 50 / 100));
        }
        if ((saldoMedio >= 1001) && (saldoMedio <= 1500)) {
            System.out.println("Valor do crédito:" + (saldoMedio * 25 / 100));

        }
        if ((saldoMedio >= 501) && (saldoMedio <= 1000)) {
            System.out.println("Valor do crédito:" + (saldoMedio * 15 / 100));

        }
        if ((saldoMedio >= 0) && (saldoMedio <= 500)) {
            System.out.println("Nenhum crédito");
        }
    }
}
