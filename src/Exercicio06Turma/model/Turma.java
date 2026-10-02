package Exercicio06Turma.model;

import java.util.ArrayList;

public class Turma
{
    private ArrayList<Aluno> alunos;

    public Turma()
    {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno (Aluno aluno)
    {
        alunos.add(aluno);
    }

    public void listarAlunos()
    {
        for (Aluno aluno : alunos)
        {
            System.out.println(aluno);
        }
    }
}