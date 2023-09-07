import java.util.Scanner;
import java.io.IOException;

public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Exemplo do-while");
        int opcao = -1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("opção 1 - Cadastrar cliente");
            System.out.println("opção 2 - Cadastrar produto");
            System.out.println("Opção 3 - Cadastrar vendedor");
            System.out.println("Opção 0 - Sair");
            System.out.print("Digite a opção: ");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Opção 1 Escolhida.");
                    break;
                case 2:
                    System.out.println("Opção 2 Escolhida.");
                    break;
                case 3:
                    System.out.print("Opção 3 Escolhida.");
                    break;
                case 4:
                    System.out.println("Opção invalida.");
                    break;
                case 5:
                    System.out.println("Opção invalida.");
                    break;
                case 6:
                    System.out.println("Opção invalida.");
                    break;
                case 7:
                    System.out.println("Opção invalida.");
                    break;
                case 8:
                    System.out.println("Opção invalida.");
                    break;
                case 9:
                    System.out.println("Opção invalida.");
                    break;
                case 0:
                    break;
            }
        }while (opcao != 0);

        double x = 10000.0 / 3.0;
        System.out.print(x);
        System.out.printf("\n%, .3f", x);
        System.out.printf("\nR$ %, .2f", x);
    }
}
