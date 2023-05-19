import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n[] = new int[6];

        for (int i = 0 ; i < 6 ; i++)
        {
            System.out.printf("Insira o número %d. ", i+1);
            n[i] = teclado.nextInt();
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0 ; i < 6 ; i++)
        {
            if (n[i] % 2 == 0)
            {
                pares++;
            } else
            {
                impares++;
            }
        }

        System.out.printf("Pares: %d\n", pares);
        System.out.printf("Impares: %d\n", impares);
    }
}