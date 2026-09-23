package Exercicio06Turma.app;

import Exercicio06Turma.model.Aluno;

public class Main
{
    public static void main(String[] args)
    {
        double[] notasGustavo = {10.0, 8.0, 7.0, 3.0, 6.0, 2.9, 7.4, 4.6, 8.2, 10.0};
        double[] notasLucas = {4.2, 3.0, 7.0, 4.2, 7.4, 3.9, 10.0, 8.6, 7.9, 10.0};

        Aluno aluno1 = new Aluno("Gustavo", 19, 1001, notasGustavo);
        Aluno aluno2 = new Aluno("Lucas", 19, 2000, notasLucas);

        System.out.println(aluno1);
        System.out.println();
        System.out.println(aluno2);
    }
}