public class Empregado
{
    private String nome;
    private String sobrenome;
    private double salario;

    // Construtor

    public Empregado(String nome, String sobrenome, double salario)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    // Métodos

    public String getNome()
    {
        return nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }

    public double setAumento()
    {
        double newSalario = salario + ((salario * 10) / 100);

        return  newSalario;
    }

    public String toString()
    {
        return "Funcionário: " + getNome() + "\n" + "Salário: " + getSalario() + "\n";
    }
}
