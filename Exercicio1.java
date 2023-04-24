import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.println("A média aritmética de " + num1 + " e " + num2 + " é: " + media);

        input.close();
    }
}