public class Triangulo extends Figura {
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura, String cor)
    {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    // Outros métodos...

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double area(double base, double altura)
    {
        double area = (base * altura) /2;
        return area;
    }

    public String toString()
    {
        return "[Triângulo]\n" + "Área = " + area(base,altura) + "\n" + "Cor = " + getCor();
    }
}
