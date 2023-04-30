import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int H;
        double b;
        double v;
        double fm = 59.82;
        int fl;

        System.out.println("Quantidade de horas trabalhadas num mês:");
        H = scanner.nextInt();

        System.out.println("Qual o valor recebido por hora:");
        v = scanner.nextDouble();

        System.out.println("Quantidade de filhos menores de 14 anos:");
        fl = scanner.nextInt();

        b = (H * v) + (fl * fm);

        System.out.println("O salario bruto a ser recebido é:" + b);
        

        scanner.close();
    }
}
