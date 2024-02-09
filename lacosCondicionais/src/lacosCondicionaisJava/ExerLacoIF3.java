package lacosCondicionaisJava;
import java.util.Scanner;

public class ExerLacoIF3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o Nome do doador: ");
        String nomeDoador = scan.nextLine();

        System.out.print("Digite a Idade do doador: ");
        int idadeDoador = scan.nextInt();

        System.out.print("É a sua primeira doação? ");
        boolean primeiraDoacao = scan.nextBoolean();

        if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && primeiraDoacao) {
                System.out.printf("%s não está apto(a) a doar sangue!", nomeDoador);
            } else {
                System.out.printf("%s está apto(a) para doar sangue!", nomeDoador);
            }
        } else {
            System.out.printf("%s não está apto(a) a doar sangue!", nomeDoador);
        }
        scan.close();
    }
}
