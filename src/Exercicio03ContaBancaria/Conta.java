package Exercicio03ContaBancaria;

public class Conta
{
    private String titular;
    private double saldo;
    private int numero;

    public Conta(String titular, int numero)
    {
        this.titular = titular;
        this.numero = numero;
    }

    public Conta(String titular, int numero, double saldo)
    {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular()
    {
        return titular;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public int getNumero()
    {
        return numero;
    }

    void depositar(double valor)
    {
        if (valor > 0)
        {
            this.saldo += valor;
            System.out.println("Depósito realizado.");
        }
        else
        {
            System.out.println("Valor inválido.");
        }
    }

    void sacar(double valor)
    {
        if (valor <= 0)
        {
            System.out.println("Valor inválido.");
        }
        else if (valor > saldo)
        {
            System.out.println("Saldo insuficiente.");
        }
        else
        {
            saldo -= valor;
            System.out.println("Saque realizado.");
        }
    }
}
