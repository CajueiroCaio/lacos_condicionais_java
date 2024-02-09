package lacosCondicionaisJava;
import java.util.Scanner;

public class ExerLacoIF2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scan.nextInt();

        float numeroPar = numero % 2;

        if (numeroPar == 0 && numero >=0) {
            System.out.printf("Esse número %d é par e positivo!", numero);
        } else if (numeroPar != 0 && numero < 0) {
            System.out.printf("Esse número %d é ímpar e negativo!", numero);
        } else if(numeroPar == 0 && numero <0) {
            System.out.printf("Esse número %d é par e negativo!", numero);
        } else {
            System.out.printf("Esse número %d é ímpar e positivo!", numero);
        }
        scan.close();
    }
}
