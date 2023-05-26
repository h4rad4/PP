import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro Fiat = new Carro();
        // Incompleto
    }

    void Acelera() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a velocidade atual. ");
        double v = teclado.nextFloat();

        System.out.println("Insira o valor da aceleração. ");
        double a = teclado.nextFloat();

        Carro modelo = new Carro();
        modelo.v += a;

        System.out.printf("Velocidade = %d", v);

        if (v >= v_max) {
            System.out.println("Velocidade máxima atingida! ");
        }
    }

    void Ocupantes() {
        Scanner teclado = new Scanner(System.in);
        int pessoas = 5;

        for (int i = 0; i < pessoas; i++) {
            System.out.printf("Há alguém sentado no assento %i? ", i);
            String option = teclado.nextLine();

            if (option == "S") {
                System.out.println("Use o cinto de segurança! ");
            } else {
                System.out.println("Assento disponível. ");
            }

        }
    }

}
