package lacosCondicionaisJava;
import java.util.Scanner;
public class LacoCondicionalSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cachorroQuente = "Cachorro Quente", xSalada = "X-Salada", xBacon = "X-Bacon", bauru = "Bauru";
        String refri = "Refrigerante", sucoLaranja = "Suco de Laranja";

        float valorCachorroQuente = 10.00f, valorXSalada = 15.00f, valorXBacon = 18.00f, valorBauru = 12.00f;
        float valorRefri = 8.00f, valorSucoLaranja = 13.00f;

        String mensagem = """
                Bem vindos a NossaLanchonete!!!
                Aqui está o cardápio:
                -----------------------------------------
                Código| Produto | Preço Unitário
                  1   | %s | R$ %.2f
                  2   | %s | R$ %.2f
                  3   | %s | R$ %.2f
                  4   | %s | R$ %.2f
                  5   | %s | R$ %.2f
                  6   | %s | R$ %.2f
                """.formatted(cachorroQuente, valorCachorroQuente, xSalada, valorXSalada, xBacon, valorXBacon,
                bauru, valorBauru, refri, valorRefri, sucoLaranja, valorSucoLaranja);

        System.out.println(mensagem);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = scan.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidadeProduto = scan.nextInt();

        switch (codigoProduto) {
            case 1:
                System.out.println("-------------------------");
                System.out.printf("Produto: %s\n", cachorroQuente);
                System.out.printf("Valor Total: %.2f", valorCachorroQuente * quantidadeProduto);
                break;
            case 2:
                System.out.println("-------------------------");
                System.out.printf("Produto: %s\n", xSalada);
                System.out.printf("Valor Total: %.2f", valorXSalada * quantidadeProduto);
                break;
            case 3:
                System.out.println("-------------------------");
                System.out.printf("Produto: %s\n", xBacon);
                System.out.printf("Valor Total: %.2f", valorXBacon * quantidadeProduto);
                break;
            case 4:
                System.out.println("-------------------------");
                System.out.printf("Produto: %s\n", bauru);
                System.out.printf("Valor Total: %.2f", valorBauru * quantidadeProduto);
                break;
            case 5:
                System.out.println("-------------------------");
                System.out.printf("Produto: %s\n", refri);
                System.out.printf("Valor Total: %.2f", valorRefri * quantidadeProduto);
                break;
            case 6:
                System.out.println("-------------------------");
                System.out.printf("Produto: %s\n", sucoLaranja);
                System.out.printf("Valor Total: %.2f", valorSucoLaranja * quantidadeProduto);
                break;
            default:
                System.out.println("Código de Produto inválido");
                break;
        }
        scan.close();
    }
}
