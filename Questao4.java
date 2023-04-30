import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double M;
        double C;
        double I;
        int n;

        System.out.println("Qual o capital a ser aplicado:");
        C = scanner.nextDouble();

        System.out.println("Qual é a taxa de juros:");
        I = scanner.nextDouble();

        System.out.println("Qual o prazo da aplicação em meses:");
        n = scanner.nextInt();

        M = C * Math.pow(1 + I, n);

        System.out.println("O seu montante a ser recebido é:" + M);

        scanner.close();
    }
}
