import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do capital a ser aplicado: ");
        double capital = input.nextDouble();

        System.out.print("Informe o prazo de aplicação em meses: ");
        int prazo = input.nextInt();

        System.out.print("Informe a taxa de juros mensal: ");
        double taxaJuros = input.nextDouble();

        double montante = capital * Math.pow(1 + taxaJuros, prazo);

        System.out.println("O montante a ser recebido é: " + montante);
    }
}
