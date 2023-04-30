import java.util.Scanner;

public class Questao1 {
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double n1;
    double n2;
    double media;

    System.out.println("Escreva o primeiro numero");
    n1 = scanner.nextDouble();

    System.out.println("Escreva o segundo numero");
    n2 = scanner.nextDouble();

    media = (n1 + n2) / 2;

    System.out.println("O resultado da média é:" + media);

    scanner.close();

   }
}
