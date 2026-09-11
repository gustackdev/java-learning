package Exercicio04Aluno;

public class Aluno
{
    private String nome;
    private int matricula;
    private double nota;

    public String getNome()
    {
        return nome;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public double getNota()
    {
        return nota;
    }

    public Aluno(String nome, int matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, double nota)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    void alterarNota(double nota)
    {
        if(nota > 0 && nota <= 10)
        {
            this.nota = nota;
        }
        else
        {
            System.out.println("Nota inválida.");
        }
    }

    void verificarSituacao()
    {
        if(this.nota >= 6)
        {
            System.out.println("Aprovado.");
        }
        else if (this.nota >= 4 && this.nota < 6)
        {
            System.out.println("Em recuperação.");
        }
        else
        {
            System.out.println("Reprovado.");
        }
    }
}
