public class Quadrado extends Retangulo {

    // Construtor
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }

    // Outros métodos...
    public String toString() {
        return "[Quadrado]\n" + "Área = " + area() + "\n" + "Cor = " + getCor();
    }
}
