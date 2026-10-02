package Exercicio06Turma.app;

import Exercicio06Turma.model.Aluno;
import Exercicio06Turma.model.Turma;

public class Main
{
    public static void main(String[] args)
    {
        double[] notasAluno1 = {10.0, 8.0, 7.0, 3.0, 6.0, 2.9, 7.4, 4.6, 8.2, 10.0};
        double[] notasAluno2 = {4.2, 3.0, 7.0, 4.2, 7.4, 3.9, 10.0, 8.6, 7.9, 10.0};

        Aluno aluno1 = new Aluno("Gustavo", 19, 1001, notasAluno1);
        Aluno aluno2 = new Aluno("Lucas", 19, 2000, notasAluno2);

        Turma turma = new Turma();

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
    }
}