package model;

import java.util.ArrayList;
import java.util.List;

public class Itens {
	private List<ItensProduto> itens;

    public Itens() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
    	ItensProduto item = new ItensProduto(produto, quantidade);
        itens.add(item);
    }

    public List<ItensProduto> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItensProduto item : itens) {
            total += item.getTotal();
        }
        return total;
    }
    
    public void exibirNota() {
        System.out.println("Nota de Venda:");
        for (ItensProduto item : itens) {
            System.out.printf("Produto: %s | Quantidade: %d | Preço Unitário: %.2f | Total: %.2f\n",
                    item.getProduto().getNome(), item.getQuantidade(), item.getProduto().getPreco(), item.getTotal());
        }
        System.out.printf("Valor total da venda: %.2f\n", calcularTotal());
    }
}
