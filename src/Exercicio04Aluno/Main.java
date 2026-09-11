package Exercicio04Aluno;

public class Main
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno("Gustavo", 123);

        Aluno aluno2 = new Aluno("Maria", 321, 6);

        aluno1.alterarNota(4);
        aluno2.alterarNota(7);

        aluno1.verificarSituacao();
        aluno2.verificarSituacao();
    }
}