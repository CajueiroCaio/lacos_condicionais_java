package lacosCondicionaisJava;
import java.util.Scanner;

public class ExerLacoIF1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int numA = scan.nextInt();

        System.out.print("Digite o número B: ");
        int numB = scan.nextInt();

        System.out.print("Digite o número C: ");
        int numC = scan.nextInt();

        int somaAB = numA + numB;

        if (somaAB > numC) {
            System.out.printf("%d + %d = %d > %d\n", numB, numA, somaAB, numC);
            System.out.printf("A Soma de A + B é Maior do que C");
        } else if (somaAB < numC) {
            System.out.printf("%d + %d = %d < %d\n", numB, numA, somaAB, numC);
            System.out.printf("A Soma de A + B é Menor do que C");
        } else {
            System.out.printf("%d + %d = %d = %d\n", numB, numA, somaAB, numC);
            System.out.printf("A Soma de A + B é Igual do que C");
        }
        scan.close();

    }

}
