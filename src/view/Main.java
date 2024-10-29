package view;

import model.Itens;
import model.Produto;

public class Main {

	public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 5.00);
        Produto p2 = new Produto("Feijão", 7.50);
        Produto p3 = new Produto("Macarrão", 4.00);

        Itens nota = new Itens();
        nota.adicionarItem(p1, 2); // 2 unidades de Arroz
        nota.adicionarItem(p2, 1); // 1 unidade de Feijão
        nota.adicionarItem(p3, 3); // 3 unidades de Macarrão

        nota.exibirNota(); // Exibe a nota de venda com detalhes
    }

}
