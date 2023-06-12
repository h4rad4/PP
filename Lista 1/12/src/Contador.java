public class Contador
{
    private int count = 0;

    // Construtor

    public Contador () {}

    // Métodos

    public void zerarContador()
    {
        this.count = 0;
    }

    public void incrementarContador(int n)
    {
        this.count += n;
    }

    public int getContador()
    {
        return count;
    }

    public String toString()
    {
        return "Valor atual do contador: " + getContador() + "\n";
    }
}
