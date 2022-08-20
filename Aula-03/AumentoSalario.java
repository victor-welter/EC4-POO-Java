/*
4. Uma empresa vai conceder AUMENTO DE SALÁRIO aos seus funcionários, de acordo com o 
CARGO ocupado, conforme a tabela abaixo. Faça um algoritmo que leia o SALÁRIO e o 
CARGO de um funcionário e calcule o NOVO SALÁRIO. Se o cargo do funcionário não 
estiver na tabela, ele deverá, então, receber 40% de aumento. Ao final mostre o SALÁRIO 
ANTIGO, o NOVO SALÁRIO. 

Cód | Percentual | Cargo
 G | 10% | Gerente
 E | 20% | Engenheiro
 T | 30% | Técnico
 */

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {

        Salario salario = new Salario();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o código do cargo: (G, E, T)");
            salario.codigo = scanner.nextLine();

            System.out.println("Informe o salário atual: ");
            salario.salario = scanner.nextFloat();

            salario.aumentoSalarial();

        } finally {
            scanner.close();
        }
    }
}

class Salario {
    String codigo;
    int percentual;
    String cargo;
    float salario;

    void aumentoSalarial() {
        switch (codigo.toUpperCase()) {
            case "G":
                salario += salario * 10 / 100;

                break;
            case "E":
                salario += salario * 20 / 100;

                break;
            case "T":
                salario += salario * 30 / 100;

                break;
            default:
                salario += salario * 40 / 100;
        }

        System.out.println("Salário atualizado: " + salario);
    }
}