package lacosCondicionaisJava;
import java.util.Scanner;

public class LacoCondicionalSwitch3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operacaoSoma = "Soma", operacaoSubtracao = "Subtração", operacaoMultiplicacao = "Multiplicação";
        String operacaoDivisao = "Divisão";

        String mensagem = """
                ------------------------------
                 Código | Operação
                    1   | %s
                    2   | %s
                    3   | %s
                    4   | %s
                """.formatted(operacaoSoma,operacaoSubtracao,operacaoMultiplicacao,operacaoDivisao);

        System.out.println(mensagem);

        System.out.print("Digite o 1º número: ");
        float num1 = scan.nextFloat();

        System.out.print("Digite o 2º número: ");
        float num2 = scan.nextFloat();

        System.out.print("Digite o código da operação que quer realizar: ");
        int numOperacao = scan.nextInt();

        switch (numOperacao) {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                break;
            default:
                System.out.print("Operação Inválida!");
                break;
        }
        scan.close();
    }
}
