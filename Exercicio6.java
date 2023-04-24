import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = input.nextDouble();

        double resultado = Math.log(num1) / Math.log(num2);

        System.out.println("O logaritmo de " + num1 + " na base " + num2 + " é: " + resultado);
    }
}
