import java.util.Scanner;


public class PostoCombustivel{
    public static void main(String[] args){
        double valorCombustivel = 0;

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Informe o tipo do combustível:");
            String tipoCombustivel = scanner.next();

            switch(tipoCombustivel){
                case "E":
                    valorCombustivel = 5.19;
                    break;
                case "G":
                    valorCombustivel = 5.35;
                    break;
                case "D":
                    valorCombustivel = 7.10;
                    break;
                default:
                    System.out.println("Combustível inválido");
                    break;
            }

                System.out.println("Digite a quantidade de litros: ");
                double quantidade = scanner.nextDouble();

                double valorTotal = quantidade * valorCombustivel;

                System.out.println("O valor total: " + valorTotal);
            
        } finally {
            scanner.close();
        }
    }
}