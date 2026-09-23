package Exercicio06Turma.model;

import java.util.Arrays;

public class Aluno
{
    private String nome;
    private int idade;
    private int matricula;
    private double[] notas;

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public double[] getNotas()
    {
        return notas;
    }

    public Aluno(String nome, int idade, int matricula, double[] notas)
    {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia()
    {
        double soma = 0;

        for (double nota : notas)
        {
            soma += nota;
        }

        return soma / notas.length;
    }

    public String toString()
    {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}