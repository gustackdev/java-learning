package Exercicio07CacaAoTesouro.model;

public class CacaAoTesouro
{
    private Pista primeiraPista;
    private Pista ultimaPista;

    public CacaAoTesouro()
    {
        primeiraPista = null;
        ultimaPista = null;
    }

    public void adicionarPista(String nomeIlha, String mensagem)
    {
        Pista novaPista = new Pista(nomeIlha, mensagem);

        if (primeiraPista == null)
        {
            primeiraPista = novaPista;
            ultimaPista = novaPista;
        }
        else
        {
            ultimaPista.setProximaPista(novaPista);
            ultimaPista = novaPista;
        }
    }

    public void iniciarJornada()
    {
        if (primeiraPista == null)
        {
            System.out.println("Nenhuma pista cadastrada.");
            return;
        }

        Pista pistaAtual = primeiraPista;

        while (pistaAtual != null)
        {
            System.out.println("Ilha: " + pistaAtual.getNomeIlha());
            System.out.println("Pista: " + pistaAtual.getMensagem());
            System.out.println();

            pistaAtual = pistaAtual.getProximaPista();
        }
    }

    public Pista buscarPista(String nomeIlha)
    {
        Pista pistaAtual = primeiraPista;

        while (pistaAtual != null)
        {
            if (pistaAtual.getNomeIlha().equals(nomeIlha))
            {
                return pistaAtual;
            }

            pistaAtual = pistaAtual.getProximaPista();
        }

        System.out.println("Ilha não encontrada.");
        return null;
    }

    public boolean removerPista(String nomeIlha)
    {
        if (primeiraPista == null)
        {
            System.out.println("Nenhuma pista cadastrada.");
            return false;
        }

        Pista pistaAtual = primeiraPista;
        Pista pistaAnterior = null;

        while (pistaAtual != null)
        {
            if (pistaAtual.getNomeIlha().equals(nomeIlha))
            {
                if (pistaAtual == primeiraPista)
                {
                    primeiraPista = primeiraPista.getProximaPista();

                    if (primeiraPista == null)
                    {
                        ultimaPista = null;
                    }
                }
                else
                {
                    pistaAnterior.setProximaPista(pistaAtual.getProximaPista());

                    if (pistaAtual == ultimaPista)
                    {
                        ultimaPista = pistaAnterior;
                    }
                }

                System.out.println("Pista removida com sucesso.");
                return true;
            }

            pistaAnterior = pistaAtual;
            pistaAtual = pistaAtual.getProximaPista();
        }

        System.out.println("Ilha não encontrada.");
        return false;
    }
}