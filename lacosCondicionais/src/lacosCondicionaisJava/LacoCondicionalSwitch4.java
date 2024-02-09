package lacosCondicionaisJava;
import java.util.Queue;
import java.util.Scanner;

public class LacoCondicionalSwitch4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operacaoVerSaldo = "Saldo", operacaoSaque = "Saque", operacaoDeposito = "Depósito";
        float saldo = 1000.00f;
        float valorSaque;
        float deposito;
        int escolhaOperacao;

        String mensagem = """
                Código da Operação| Operação
                        1         | %s
                        2         | %s 
                        3         | %s 
                """.formatted(operacaoVerSaldo,operacaoSaque,operacaoDeposito);

        System.out.println(mensagem);

        System.out.print("Qual operação deseja realizar? ");
        escolhaOperacao = scan.nextInt();

        switch (escolhaOperacao) {
            case 1:
                System.out.println("Operação - Saldo");
                System.out.printf("Saldo: %.2f", saldo);
                break;
            case 2:
                System.out.println("Operação - Saque");
                System.out.print("Quanto deseja sacar? ");
                valorSaque = scan.nextFloat();
                if (valorSaque > saldo) {
                    System.out.print("Saldo Insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.printf("Saque realizado com sucesso! O seu saldo atual agora é: %.2f", saldo);
                }
                break;
            case 3:
                System.out.print("Qual o valor que deseja depositar? ");
                deposito = scan.nextFloat();
                saldo += deposito;
                System.out.printf("Depósito feito com sucesso! Seu saldo atual agora é de: %.2f", saldo);
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
        scan.close();
    }
}
