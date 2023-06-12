public class Main {
    public static void main(String[] args)
    {
        Carro car = new Carro("SQL-4A16", 2016, "Mobi");
        Caminhao truck = new Caminhao("JAVA-7925", 2010, 3);
        Onibus bus = new Onibus("PHP-4982", 2012, 32);

        System.out.println("[Dados do carro]:\n");
        car.exibirDados();
        System.out.println();

        System.out.println("[Dados do caminhão]:\n");
        truck.exibirDados();
        System.out.println();

        System.out.println("\n[Dados do ônibus]:\n");
        bus.exibirDados();
        System.out.println();
    }
}
