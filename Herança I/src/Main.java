public class Main {
    public static void main(String [] args)
    {
        Circulo circle = new Circulo(5, "azul");
        Quadrado square = new Quadrado(5, "preto");
        Triangulo triangle = new Triangulo(5, 3, "vermelho");
        Retangulo rectangle = new Retangulo(5, 3, "branco");

        System.out.println("\n" + circle.toString());
        System.out.println("\n" + square.toString());
        System.out.println("\n" + triangle.toString());
        System.out.println("\n" + rectangle.toString());
    }
}
