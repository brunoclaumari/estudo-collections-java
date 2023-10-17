package collectionsJava.map;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {	
	
	private String nome;	
	private double preco;	
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {	
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return this.nome.compareToIgnoreCase(p.getNome());
	}
	
	public double getTotal() {
		return this.preco * this.quantidade;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + nome + ", preco=" + preco + ", quantidade="
				+ quantidade + "]\n";
	}

	
}

class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
