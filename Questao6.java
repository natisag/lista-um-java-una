import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double l1;
        double l2;
        double r;

        System.out.println("Digite um número para calcular log:");
        l1 = scanner.nextDouble();

        System.out.println("Qual é a base do calculo logaritmo:");
        l2 = scanner.nextDouble();

        r = Math.log(l1) / Math.log(l2);

        System.out.println("O resultado de log é:" + r);

        scanner.close();
    }
}
