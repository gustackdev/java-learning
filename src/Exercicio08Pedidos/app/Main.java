package Exercicio08Pedidos.app;

import Exercicio08Pedidos.model.Pedido;
import Exercicio08Pedidos.model.Produto;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Pedido pedido = new Pedido();

        System.out.print("Quantos produtos deseja adicionar? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quantidadeProdutos; i++)
        {
            System.out.println("\nProduto " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            Double preco = scanner.nextDouble();

            System.out.print("Quantidade: ");
            Integer quantidade = scanner.nextInt();
            scanner.nextLine();

            Produto produto = new Produto(nome, preco, quantidade);

            pedido.adicionarProduto(produto);
        }

        System.out.println("--- PRODUTOS DO PEDIDO ---");
        pedido.listarProduto();

        System.out.println("--- TOTAL ---");
        System.out.println("Total: R$ " + pedido.calcularTotal());

        scanner.close();
    }
}