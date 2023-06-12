import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Contador cont = new Contador();
        Scanner input = new Scanner(System.in);

        int option = 0;

        while (option != 3) {
            System.out.println("Qual operação deseja realizar? \n 1. Zerar contador\n 2. Incrementar contador\n 3. Sair\n");

            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Qual operação deseja realizar? \n 1. Zerar contador\n 2. Incrementar contador\n 3. Sair\n");

                    option = input.nextInt();

                    break;
                case 1:
                    cont.zerarContador();
                    System.out.println(cont.toString());

                    break;

                case 2:
                    System.out.println("Em quanto deseja incrementar o contador? ");
                    int n = input.nextInt();

                    cont.incrementarContador(n);
                    System.out.println(cont.toString());

                    break;

                case 3:
                    System.out.println("Encerrando programa...");
                    break;
            }
        }
    }
}
