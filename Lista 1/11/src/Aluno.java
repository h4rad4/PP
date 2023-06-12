public class Aluno
{
    private int idade;
    private double altura, peso;
    private String nome;

    // Construtor

    public Aluno(String nome, int idade, double peso, double altura)
    {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    // Métodos

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public double getAltura()
    {
        return altura;
    }

    public double getPeso()
    {
        return peso;
    }

    public double getIMC(double altura, double peso)
    {
        double IMC = peso / (altura*altura);

        return IMC;
    }
    public boolean verificaMaioridade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de idade");
            return true;
        } else {
            System.out.println("Menor de idade");
            return false;
        }
    }

    public String toString()
    {
        return "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n"
                + "Peso: " + getPeso() + "\n" + "Altura: " + getAltura() +
                "\n" + "IMC: " + getIMC(getAltura(), getPeso());
    }

}
