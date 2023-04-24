import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double preco = input.nextDouble();

        double novoPreco = preco * 1.1;

        System.out.println("Novo valor do produto: " + novoPreco);
    }
}
