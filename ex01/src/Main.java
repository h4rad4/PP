import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        float notas[] = new float[5];

        for (int i = 0; i < 5; i++) {

            System.out.printf("Insira a nota %d. ", i+1);
            notas[i] = teclado.nextFloat();
        }

        float maior = notas[0];
        float menor = notas[0];
        float soma = 0;


        for (int i = 0 ; i < 5; i++)
        {
            if (notas[i] > maior)
            {
                maior = notas[i];
            }
            if (notas[i] < menor)
            {
                menor = notas[i];
            }
            soma += notas[i];
        }

        System.out.printf("Media = %.2f\n", (soma - maior - menor)/3);
        System.out.printf("Maior = %.2f\n", maior);
        System.out.printf("Menor = %.2f\n", menor);
    }
}
