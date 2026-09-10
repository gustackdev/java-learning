package Exercicio02Personagem;

public class Personagem
{
    String nome;

    int hpMax;
    int hpAtual;
    int manaMax;
    int manaAtual;


    double exp;
    int nivel;

    int custoQ;
    int custoW;
    int custoE;
    int custoR;

    void habilidadeQ()
    {
        if (manaAtual >= custoQ)
        {
            manaAtual -= custoQ;

            System.out.println("Você usou a habilidade Q.");
            System.out.println("Mana atual: "+ manaAtual);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void habilidadeW()
    {
        if (manaAtual >= custoW)
        {
            manaAtual -= custoW;

            System.out.println("Você usou a habilidade W.");
            System.out.println("Mana atual: "+ manaAtual);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void habilidadeE()
    {
        if (manaAtual >= custoE)
        {
            manaAtual -= custoE;

            System.out.println("Você usou a habilidade E.");
            System.out.println("Mana atual: "+ manaAtual);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void habilidadeR()
    {
        if (manaAtual >= custoR)
        {
            manaAtual -= custoR;

            System.out.println("Você usou a habilidade R.");
            System.out.println("Mana atual: "+ manaAtual);
        }
        else
        {
            System.out.println("Sem mana o suficiente.");
        }
    }

    void atacado(int danoRecebido)
    {
        hpAtual -= danoRecebido;

        if (hpAtual <= 0 )
        {
            System.out.println("Você morreu.");
            hpAtual = 0;
        }
        else
        {
            System.out.println("Você recebeu "+danoRecebido+" de dano!");
            System.out.println("HP atual: "+hpAtual);
        }
    }

    void curado(int curaRecebida)
    {
        int hpPreCura;
        hpPreCura = hpAtual;
        hpAtual += curaRecebida;

        if (hpAtual > hpMax)
        {
            hpAtual = hpMax;
        }

        curaRecebida = (hpAtual - hpPreCura);

        System.out.println("Você foi curado em "+curaRecebida+" pontos de HP");
        System.out.println("HP atual: "+hpAtual);
    }
}
