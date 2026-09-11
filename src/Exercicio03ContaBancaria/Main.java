package Exercicio03ContaBancaria;

public class Main
{
    public static void main(String[] args)
    {
        Conta conta = new Conta("Gustavo", 123);

        conta.depositar(500);
        conta.sacar(200);

        System.out.println(conta.getSaldo());
    }
}
