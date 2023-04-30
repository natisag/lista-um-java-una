import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int s;
        int H;
        int M;

        System.out.println("Escreva um numero inteiro em segundos:");
        s = scanner.nextInt();
        
        H = s * 3600;

        System.out.println("O valor em Horas é:" + H);  
        
        M = s * 60;
        
        System.out.println("O valor em minutos é:" + M);  


        System.out.println("O valor em Segundos é:" + s);  

        scanner.close();
    }
}
