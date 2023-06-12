public class Carro extends Veiculo{
    private String modelo;

    // Construtor
    public  Carro (String placa, int ano, String modelo)
    {
        super(placa, ano);
        this.modelo = modelo;
    }

    // Outros métodos...

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void exibirDados()
    {
        super.exibirDados();
        System.out.printf("Modelo: %s\n", modelo);
    }
}
