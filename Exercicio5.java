import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número de horas trabalhadas no mês: ");
        int horas_trabalhadas = input.nextInt();

        System.out.print("Valor recebido por hora de trabalho: ");
        double valor_hora = input.nextDouble();

        System.out.print("Valor do salário família: ");
        double valor_salario_familia_por_filho = input.nextDouble();

        System.out.print("Número de filhos com idade menor que 14 anos: ");
        int num_filhos = input.nextInt();
        
        double salario_base = horas_trabalhadas * valor_hora;
        double salario_familia = 0;
        if (num_filhos > 0) {
            salario_familia = num_filhos * valor_salario_familia_por_filho;
        }
        double salario_bruto = salario_base + salario_familia;

        System.out.printf("Salário bruto a ser recebido: R$ %.2f%n", salario_bruto);

        input.close();
    }
}
