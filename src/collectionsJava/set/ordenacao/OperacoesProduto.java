package collectionsJava.set.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import collectionsJava.list.Pessoa;

public class OperacoesProduto {
	
	private Set<Produto> produtos;

	public OperacoesProduto() {		
		this.produtos = new HashSet<Produto>();
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		this.produtos.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public void exibirProdutosPorNome() {
		List<Produto> produtosPorNome = new ArrayList<Produto>(getProdutos());
		
		Collections.sort(produtosPorNome);
		
		 System.out.println(produtosPorNome);
	}
	
	public void exibirProdutosPorPreco() {
		List<Produto> produtosPorPreco = new ArrayList<Produto>(getProdutos());
		
		Collections.sort(produtosPorPreco, new ComparatorPorPreco());
		
		 System.out.println(produtosPorPreco);
	}
	
	

}


