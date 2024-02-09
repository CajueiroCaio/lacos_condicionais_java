package lacosCondicionaisJava;
import java.util.Scanner;

public class ExerLacoIF4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a primeira palavra: ");
        String primeiraCaracteristica = scan.nextLine();

        System.out.print("Insira a segunda palavra: ");
        String segundaCaracteristica = scan.nextLine();

        System.out.print("Insira a terceira palavra: ");
        String terceiraCaracteristica = scan.nextLine();

        if (primeiraCaracteristica.equalsIgnoreCase("Vertebrado")) {
            if(segundaCaracteristica.equalsIgnoreCase("Ave")) {
                if(terceiraCaracteristica.equalsIgnoreCase("Carnívoro")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Águia");
                } else if (terceiraCaracteristica.equalsIgnoreCase("Onívoro")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Pomba");
                } else {
                    System.out.print("Essas características são Inválidas");
                }
            } else if (segundaCaracteristica.equalsIgnoreCase("Mamífero")) {
                if (terceiraCaracteristica.equalsIgnoreCase("Onívoro")) {
                    System.out.print("O tipo de animal com essas caracteríticas é o Homem");
                } else if (terceiraCaracteristica.equalsIgnoreCase("Herbívoro")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Vaca");
                }

            } else {
                System.out.println("Essas características são Inválidas");
            }
        } else if (primeiraCaracteristica.equalsIgnoreCase("Invertebrado")) {
            if(segundaCaracteristica.equalsIgnoreCase("Inseto")) {
                if(terceiraCaracteristica.equalsIgnoreCase("Hematófago")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Pulga");
                } else if (terceiraCaracteristica.equalsIgnoreCase("Herbívoro")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Lagarta");
                } else {
                    System.out.print("Essas características são Inválidas");
                }
            } else if (segundaCaracteristica.equalsIgnoreCase("Anelídeo")) {
                if (terceiraCaracteristica.equalsIgnoreCase("Hematófago")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Sanguessuga");
                } else if (terceiraCaracteristica.equalsIgnoreCase("Onívoro")) {
                    System.out.print("O tipo de animal com essas caracteríticas é a Minhoca");
                }

            } else {
                System.out.println("Essas características são Inválidas");
            }

        } else {
            System.out.println("Essas características são Inválidas");
        }
        scan.close();
    }
}
