package Exercicio08Pedidos.model;

public class Produto
{
    private String nome;
    private Double preco;
    private Integer quantidade;

    public String getNome()
    {
        return nome;
    }

    public Double getPreco()
    {
        return preco;
    }

    public Integer getQuantidade()
    {
        return quantidade;
    }

    public Produto(String nome, Double preco, Integer quantidade)
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Double calcularSubtotal()
    {
        return preco*quantidade;
    }

    public String toString()
    {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
