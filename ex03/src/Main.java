/*
 * Crie um programa que, dado um menu com as opções SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO,
 * DIVISÃO, TABUADA o usuário seja solicitado a informar os valores para que a operação
 * selecionada seja executada. No caso da seleção da TABUADA, apenas 1 valor é necessário, nas
 * outras opções, devem ser pedidos dois valores.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual operação deseja realizar? \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Tabuada");
        int option = teclado.nextInt();

        switch (option) {
            case 1:
                System.out.printf("Soma = %d", soma());
                break;
            case 2:
                System.out.printf("Subtração = %d", subtracao());
                break;
            case 3:
                System.out.printf("Multiplicação = %d", multiplicacao());
                break;
            case 4:
                System.out.printf("Divisão = %.2f", divisao());
                break;
            case 5:
                System.out.println("-------- Tabuada -------- \n");
                tabuada();
                break;
        }
    }

    public static int soma() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor 1. ");
        int v1 = teclado.nextInt();

        System.out.println("Insira o valor 2. ");
        int v2 = teclado.nextInt();

        int result = v1 + v2;

        return result;
    }

    public static int subtracao() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor 1. ");
        int v1 = teclado.nextInt();

        System.out.println("Insira o valor 2. ");
        int v2 = teclado.nextInt();

        int result = v1 - v2;

        return result;
    }

    public static int multiplicacao() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor 1. ");
        int v1 = teclado.nextInt();

        System.out.println("Insira o valor 2. ");
        int v2 = teclado.nextInt();

        int result = v1 * v2;

        return result;
    }


    public static double divisao() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor 1. ");
        double v1 = teclado.nextDouble();

        System.out.println("Insira o valor 2. ");
        double v2 = teclado.nextDouble();

        double result = v1 / v2;

        return result;
    }

    public static void tabuada() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor. ");
        int v1 = teclado.nextInt();

        for (int i = 1; i < 10; i++)
        {
            System.out.printf("%d * %d = %d \n", v1, i, v1*i);
        }
    }
}
