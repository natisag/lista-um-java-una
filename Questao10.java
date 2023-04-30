import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n;
        double n1;
        double n2;
        double r;
        double r1;
        double r2;

        System.out.println("Descreva o primeiro número:");
        n = scanner.nextDouble();

        System.out.println("Descreva o segundo número:");
        n1 = scanner.nextDouble();

        System.out.println("Descreva o terceiro número:");
        n2 = scanner.nextDouble();

        r = (n + n1 + n2) / 3;

        System.out.println("O resultado da Média aritimética é:" + r);

        r1 = (3 / ((1 / n) + (1 / n1) + (1 / n2)));

        System.out.println("O resultado da Média harmônica é:" + r1);

        r2 = Math.cbrt(n * n1 * n2);

        System.out.println("O resultado da Média geométrica é:" + r2);

        scanner.close();
    }
}
