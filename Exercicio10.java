import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();
        
        double mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        double mediaHarmonica = 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));
        double mediaGeometrica = Math.cbrt(valor1 * valor2 * valor3);
        
        System.out.println("Média aritmética: " + mediaAritmetica);
        System.out.println("Média harmônica: " + mediaHarmonica);
        System.out.println("Média geométrica: " + mediaGeometrica);
        
        sc.close();
    }
}
