public class Circulo extends Figura {
    private double raio;

    // Construtor
    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    // Outros métodos...
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getArea() {
        double area = 3.14 * raio * raio;
        return area;
    }

    public double getDiametro() {
        double diametro = 2 * raio;
        return diametro;
    }

    public String toString() {
        return "[Círculo]\n" + "Área = " + getArea() + "\n" + "Cor = " + getCor();
    }
}
