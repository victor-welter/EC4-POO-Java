/*
1. Considerando-se uma máquina de café, a qual 
possui um controle de ingredientes conforme 
a Classe informada:

1) Implemente a Classe, com seus atributos e 
métodos;
2) Realize os testes, utilizando a classe 
Sistema.java;
3) Em repor(), implementar um controle que 
impeça reposição maior que a quantidade 
máxima.
 */

public class Ingredientes {
    public static void main(String[] args) {
        System.out.println("Ingredientes");

        IngredientesModel ingre = new IngredientesModel();

        ingre.setQuantidadeMax(100);

        ingre.repor(10);
        ingre.repor(150);
        ingre.consumir(50);

        int total = ingre.getTotal();

        System.out.println("Total: " + total);
    }
}

class IngredientesModel {
    private int quantidade;
    private int quantidadeMax;

    public void repor(int value) {
        int quant = quantidade;

        if ((quant += value) > quantidadeMax) {
            System.err.println("ERROR QUANTIDADE MAXIMA");
        } else {
            quantidade = value;
        }
    }

    public void consumir(int value) {
        if (value < quantidade) {
            quantidade -= value;
        } else {
            System.out.println("ERROR QUANTIDADE INDISPONÍVEL");
        }
    }

    public void setQuantidadeMax(int value) {
        quantidadeMax = value;
    }

    public int getTotal() {
        return quantidade;
    }
}