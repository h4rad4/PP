public class Caminhao extends Veiculo {
    private int eixos;

    // Construtor
    public  Caminhao (String placa, int ano, int eixos)
    {
        super(placa, ano);
        this.eixos = eixos;
    }

    // Outros métodos...
    public void setEixos(int eixos)
    {
        this.eixos = eixos;
    }

    public int getEixos()
    {
        return eixos;
    }

    public void exibirDados()
    {
        super.exibirDados();
        System.out.printf("Eixos: %d", eixos);
    }
}
