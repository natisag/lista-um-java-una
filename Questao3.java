import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double f1;
        double C;

        System.out.println("QUal a temperatura em Fahrenheit, para converter a temperatura em graus centígrados:");
        f1 = scanner.nextDouble();

        C = (f1 - 32) / 1.8;

        System.out.println("A temperatura é:"+ C);

        scanner.close();
    }
}
