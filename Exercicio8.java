import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o total de veículos: ");
        int totalVeiculos = input.nextInt();

        System.out.print("Informe o total de rodas: ");
        int totalRodas = input.nextInt();

        int totalMotos = (totalRodas - (totalVeiculos * 4)) / 2;
        int totalCarros = totalVeiculos - totalMotos;

        System.out.println("Há " + totalCarros + " carros e " + totalMotos + " motos no estacionamento.");
    }
}
