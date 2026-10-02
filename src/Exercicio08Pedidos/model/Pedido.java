package Exercicio08Pedidos.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido
{
    private Date data = new Date();
    private ArrayList<Produto> produtos;

    public Pedido()
    {
        data = new Date();
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto)
    {
        produtos.add(produto);
    }

    public Double calcularTotal()
    {
        Double total = 0.0;

        for(Produto produto : produtos)
        {
            total += produto.calcularSubtotal();
        }

        return total;
    }

    public void listarProduto()
    {
        for(Produto produto : produtos)
        {
             System.out.println(produto.toString());
        }
    }
}
