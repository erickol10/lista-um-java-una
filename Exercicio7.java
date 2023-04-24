import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = input.nextDouble();

        System.out.print("Informe o valor total das vendas: ");
        double totalVendas = input.nextDouble();

        System.out.print("Informe o percentual de comissão sobre as vendas (em %): ");
        double percentualComissao = input.nextDouble();

        double comissao = (percentualComissao / 100) * totalVendas;
        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$ " + salarioTotal);
    }
}
