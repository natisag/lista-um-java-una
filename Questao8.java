import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tv;
        int tr;
        int tc;
        int tm;

        System.out.println("Digite a quantidade de veiculos:");
        tv = scanner.nextInt();

        System.out.println("Digite o total de rodas:");
        tr = scanner.nextInt();

       tm = ((4 + tv) - tr) / 2;
       tc = (tm - tv);
       
        System.out.println("Total de carro são:" + tc);
        System.out.println("total de motos são:" + tm);

        scanner.close();
    }
}
