import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sf;
        double tv;
        double pc;
        double tl;

        System.out.println("Qual o salário fixo:");
        sf = scanner.nextDouble();
        
        System.out.println("Qual o total de vendas no mês:");
        tv = scanner.nextDouble();
      
        System.out.println("Qual o percentual que ele granha sobre as vendas:");
        pc = scanner.nextDouble();

        tl = sf + (tv + pc / 100);
        
        System.out.println("O salário total é:" + tl);

        scanner.close();
    }
}
