public class Veiculo {
    private String placa;
    private int ano;

    // Construtores
    public Veiculo() {}

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Outros métodos...

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void exibirDados() {
        System.out.printf("Placa: %s\n", getPlaca());
        System.out.printf("Ano : %s\n", getAno());
    }
}
