public class Main
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno("Bob Esponja", 22, 60.2, 1.66);
        Aluno aluno2 = new Aluno("Pica-Pau", 17, 49.2, 1.60);
        Aluno aluno3 = new Aluno("Recruta", 24, 50.6, 1.70);

        System.out.println(aluno1.toString());
        aluno1.verificaMaioridade(aluno1.getIdade());
        System.out.println("");

        System.out.println(aluno2.toString());
        aluno2.verificaMaioridade(aluno2.getIdade());
        System.out.println("");

        System.out.println(aluno3.toString());
        aluno3.verificaMaioridade(aluno3.getIdade());
        System.out.println("");
    }
}

