package Exercicio01Caneta;

public class Caneta
{
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status()
    {
        System.out.println("===STATUS ATUAL DA CANETA===");
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? "+ this.tampada);
    }

    void rabiscar()
    {
        if (tampada == true)
        {
            System.out.println("A caneta está tampada e não pode rabiscar");
        }
        else
        {
            System.out.println("Rabisco");
        }
    }

    void tampar()
    {
        this.tampada = true;
    }

    void destampar()
    {
        this.tampada = false;
    }
}
