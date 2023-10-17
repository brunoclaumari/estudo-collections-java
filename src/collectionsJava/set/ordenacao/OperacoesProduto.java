package collectionsJava.set.ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class OperacoesProduto {
	
	private Set<Produto> produtos;

	public OperacoesProduto() {		
		this.produtos = new TreeSet<Produto>();
	}

	public Set<Produto> getProdutos() {
		return produtos;
	}
	
	public void adicionarProduto(long cod, String descricao, double preco, int quantidade) {
		this.produtos.add(new Produto(cod, descricao, preco, quantidade));
	}
	
	public void exibirProdutosPorDescricao() {
		Set<Produto> produtosPorDescricao = new TreeSet<Produto>(getProdutos());	
				
		System.out.println(produtosPorDescricao);
	}
	
	public void exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		
		produtosPorPreco.addAll(produtos);
		
		 System.out.println(produtosPorPreco);
	}
	
	

}


