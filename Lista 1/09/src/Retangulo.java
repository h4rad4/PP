public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    // Construtor

    public Retangulo(double lado1, double lado2, String cor)
    {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
        double lado = lado1;
    }

    // Outros métodos...


    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }

    public double getLado1 ()
    {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double area()
    {
        double area = lado1 * lado2;

        return area;
    }

    public String toString()
    {
        return "[Retângulo]\n" + "Área = " + area() + "\n" + "Cor = " + getCor();
    }
}
