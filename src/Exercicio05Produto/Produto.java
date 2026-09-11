package Exercicio05Produto;

public class Produto
{
    private String nome;
    private double preco;
    private int estoque;

    public String getNome()
    {
        return nome;
    }

    public double getPreco()
    {
        return preco;
    }

    public int getEstoque()
    {
        return estoque;
    }

    public Produto(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int estoque)
    {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    void reporEstoque(int quantidade)
    {
        if(quantidade > 0)
        {
            this.estoque += quantidade;
            System.out.println("Estoque aumentado em "+quantidade+" unidades");
            System.out.println("Nova quantidade em estoque: "+this.estoque);
        }
        else
        {
            System.out.println("Quantidade inválida.");
        }
    }

    void vender(int quantidade)
    {
        if (quantidade > estoque)
        {
            System.out.println("Estoque insuficiente.");
        }
        else if (quantidade <= 0)
        {
            System.out.println("Quantidade inválida.");
        }
        else
        {
            estoque -= quantidade;
            System.out.println("Venda realizada.");
        }
    }

    void aplicarDesconto(double percentual)
    {
        if (percentual <= 0 || percentual > 50)
        {
            System.out.println("Percentual de desconto inválido.");
        }
        else
        {
            preco -= preco * (percentual / 100);
            System.out.println("Desconto aplicado! Novo preço: "+preco);
        }
    }

    String verificarEstoque()
    {
        if (this.estoque <= 0)
        {
            return "Sem estoque.";
        }
        else
        {
            return "Estoque disponível";
        }
    }
}
