package Exercicio02Personagem;

public class Personagem
{
    String nome;
    int hp;
    int mana;
    double exp;
    int nivel;
    int custoQ;
    int custoW;
    int custoE;
    int custoR;

    void habilidadeQ()
    {
        if (mana >= custoQ)
        {
            mana -= custoQ;

            System.out.println("Você usou a habilidade Q.");
            System.out.println("Mana atual: "+ mana);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void habilidadeW()
    {
        if (mana >= custoW)
        {
            mana -= custoW;

            System.out.println("Você usou a habilidade W.");
            System.out.println("Mana atual: "+ mana);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void habilidadeE()
    {
        if (mana >= custoE)
        {
            mana -= custoE;

            System.out.println("Você usou a habilidade E.");
            System.out.println("Mana atual: "+ mana);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void habilidadeR()
    {
        if (mana >= custoR)
        {
            mana -= custoR;

            System.out.println("Você usou a habilidade R.");
            System.out.println("Mana atual: "+ mana);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }
}
