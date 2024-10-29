package model;

import java.util.ArrayList;

public class ItensProduto {
	private Produto produto;
	private int quantidade;
	private double total;
	
	
	public ItensProduto(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public double getTotal() {
		return produto.getPreco()*this.quantidade;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
