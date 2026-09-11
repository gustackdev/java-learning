package Exercicio05Produto;

public class Main
{
    public static void main(String[] args)
    {
        Produto p1 = new Produto("Gloss", 50, 100);
        Produto p2 = new Produto("Máscara de Cílios", 40);

        System.out.println("=== PRODUTO 1 ===");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Estoque: " + p1.getEstoque());

        p1.vender(20);
        p1.aplicarDesconto(10);

        System.out.println("Situação: " + p1.verificarEstoque());

        System.out.println();

        System.out.println("=== PRODUTO 2 ===");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Preço: " + p2.getPreco());
        System.out.println("Estoque: " + p2.getEstoque());

        p2.reporEstoque(50);
        p2.vender(10);
        p2.aplicarDesconto(20);

        System.out.println("Situação: " + p2.verificarEstoque());

        System.out.println();

        System.out.println("=== RESULTADO FINAL ===");

        System.out.println(
                p1.getNome() +
                        " | Preço: " + p1.getPreco() +
                        " | Estoque: " + p1.getEstoque() +
                        " | " + p1.verificarEstoque()
        );

        System.out.println(
                p2.getNome() +
                        " | Preço: " + p2.getPreco() +
                        " | Estoque: " + p2.getEstoque() +
                        " | " + p2.verificarEstoque()
        );
    }
}