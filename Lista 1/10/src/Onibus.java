public class Onibus extends Veiculo {
    private int assentos;

    // Construtor
    public Onibus (String placa, int ano, int assentos)
    {
        super(placa, ano);
        this.assentos = assentos;
    }

    // Outros métodos...


    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getAssentos ()
    {
        return assentos;
    }

    public void exibirDados()
    {
        super.exibirDados();
        System.out.printf("Qtd. Assentos: %d", assentos);
    }
}
