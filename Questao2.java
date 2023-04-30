import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n1;
        double acrescimo;
        double resultado;

        System.out.println("Valor do preço atual, para saber qual é o acrescimo de 10%");
        n1 = scanner.nextDouble();

        acrescimo = n1 * 0.10;
        resultado = acrescimo + n1;
        
        System.out.println("O preço atual é:" + resultado);

        scanner.close();
    }
}
