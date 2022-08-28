/*
5) Escreva um algoritmo para repetir a leitura de uma SENHA até que ela seja válida. 
Para cada leitura da senha incorreta informada escrever a mensagem "SENHA 
INVÁLIDA". Quando a senha for informada corretamente deve ser impressa a 
mensagem "ACESSO PERMITIDO" e o algoritmo encerrado. Considere que a senha 
correta é “BRASIL”.
 */

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            boolean isCorrect = false;
            String senhaCorreta = "BRASIL";

            do {
                System.out.println("Informe os números: ");
                String senha = scanner.nextLine();

                if (senha.equals(senhaCorreta)) {
                    isCorrect = true;
                    System.out.println("ACESSO PERMITIDO");
                } else {
                    System.out.println("SENHA INVÁLIDA");
                }
            } while (!isCorrect);

        } finally {
            scanner.close();
        }
    }
}
