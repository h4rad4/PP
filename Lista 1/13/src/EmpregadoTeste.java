public class EmpregadoTeste
{
    public static void main(String[] args)
    {
        Empregado p1 = new Empregado("Jurandir", "Da Silva", 1205.5);
        Empregado p2 = new Empregado("Jucimar", "De Souza", 1305.5);

        System.out.println(p1.toString());
        System.out.println("Salário após aumento de 10% = " + p1.setAumento());
        System.out.println("\n");

        System.out.println(p2.toString());
        System.out.println("Salário após aumento de 10% = " + p2.setAumento());
        System.out.println("\n");
    }
}
