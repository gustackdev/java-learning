package Exercicio07CacaAoTesouro.app;

import Exercicio07CacaAoTesouro.model.CacaAoTesouro;
import Exercicio07CacaAoTesouro.model.Pista;

/*
 * Integrante 1: PREENCHER NOME COMPLETO
 * Matrícula: PREENCHER MATRÍCULA
 *
 * Integrante 2: PREENCHER NOME COMPLETO
 * Matrícula: PREENCHER MATRÍCULA
 */

public class Main
{
    public static void main(String[] args)
    {
        CacaAoTesouro cacaAoTesouro = new CacaAoTesouro();

        cacaAoTesouro.adicionarPista("Ilha dos Pássaros", "Procure pela palmeira torta na praia leste.");
        cacaAoTesouro.adicionarPista("Ilha da Névoa", "Siga o rio até a caverna; atente-se às rochas.");
        cacaAoTesouro.adicionarPista("Ilha do Esqueleto", "Cuidado com as armadilhas no caminho de pedra.");
        cacaAoTesouro.adicionarPista("Ilha das Sereias", "Navegue ao sul até encontrar o rochedo azul.");
        cacaAoTesouro.adicionarPista("Ilha do Baú de Ouro", "PARABÉNS! Você encontrou o tesouro do Capitão Morgan!");

        System.out.println("=== ROTA ORIGINAL ===");
        cacaAoTesouro.iniciarJornada();

        System.out.println("=== SABOTAGEM ===");
        cacaAoTesouro.removerPista("Ilha do Esqueleto");

        System.out.println();

        System.out.println("=== NOVA ROTA ===");
        cacaAoTesouro.iniciarJornada();

        System.out.println("=== BUSCA PELO TESOURO ===");

        Pista pistaEncontrada = cacaAoTesouro.buscarPista("Ilha do Baú de Ouro");

        if (pistaEncontrada != null)
        {
            System.out.println(pistaEncontrada.getMensagem());
        }
    }
}