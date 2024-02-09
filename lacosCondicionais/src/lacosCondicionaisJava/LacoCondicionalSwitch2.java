package lacosCondicionaisJava;

import java.util.Scanner;

public class LacoCondicionalSwitch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String gerente = "Gerente", vendedor = "Vendedor", supervisor = "Supervisor", motorista = "Motorista";
        String estoquista = "Estoquista", tecnicoTI = "Técnico de TI";

        float reajusteGerente = 10.00f, reajusteVendedor = 7.00f, reajusteSupervisor = 9.00f, reajusteMotorista = 6.00f;
        float reajusteEstoquista = 5.00f, reajusteTecnicoTI = 8.00f;

        String mensagem = """
                -----------------------------------------
                Código do Cargo| Cargo | Preço Unitário
                       1       | %s |  %.2f%%
                       2       | %s |  %.2f%%
                       3       | %s |  %.2f%%
                       4       | %s |  %.2f%%
                       5       | %s |  %.2f%%
                       6       | %s |  %.2f%%
                """.formatted(gerente,reajusteGerente,vendedor,reajusteVendedor,supervisor,reajusteSupervisor,motorista,
                reajusteMotorista,estoquista,reajusteEstoquista,tecnicoTI,reajusteTecnicoTI);

        System.out.println(mensagem);

        System.out.print("Digite o nome do colaborador: ");
        String nomeColaborador = scan.nextLine();

        System.out.print("Digite o cargo: ");
        int cargo = scan.nextInt();

        System.out.print("Digite o salário: ");
        float salario = scan.nextFloat();

        switch (cargo) {
            case 1:
                System.out.println("-------------------------");
                System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
                System.out.printf("Cargo: %s\n", gerente);
                System.out.printf("Salário: %.2f", salario + salario * ((reajusteGerente)/100));
                break;
            case 2:
                System.out.println("-------------------------");
                System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
                System.out.printf("Cargo: %s\n", vendedor);
                System.out.printf("Salário: %.2f", salario + salario * (reajusteVendedor/100));
                break;
            case 3:
                System.out.println("-------------------------");
                System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
                System.out.printf("Cargo: %s\n", supervisor);
                System.out.printf("Salário: %.2f", salario + salario * (reajusteSupervisor/100));
                break;
            case 4:
                System.out.println("-------------------------");
                System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
                System.out.printf("Cargo: %s\n", motorista);
                System.out.printf("Salário: %.2f", salario + salario * (reajusteMotorista/100));
                break;
            case 5:
                System.out.println("-------------------------");
                System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
                System.out.printf("Cargo: %s\n", estoquista);
                System.out.printf("Salário: %.2f", salario + salario * (reajusteEstoquista/100));
                break;
            case 6:
                System.out.println("-------------------------");
                System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
                System.out.printf("Cargo: %s\n", tecnicoTI);
                System.out.printf("Salário: %.2f", salario + salario * (reajusteTecnicoTI/100));
                break;
            default:
                System.out.print("Código de Cargo inválido.");
                break;
        }
        scan.close();
    }
}
