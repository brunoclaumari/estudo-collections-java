package collectionsJava.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> estoqueProdutosMap;
	
	double totalEstoque;

	public EstoqueProdutos() {		
		this.estoqueProdutosMap = new HashMap<Long, Produto>();
	}
	
	public Map<Long, Produto> getEstoqueProdutos() {
		return estoqueProdutosMap;
	}
	
	public void adicionarProduto(long cod, String nome, double preco,int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularTotalEstoque() {		
		totalEstoque = 0.0;
		if(!estoqueProdutosMap.isEmpty()) {			
			this.estoqueProdutosMap.values().forEach(x->{
				totalEstoque += x.getTotal();
			});
		}
		
		return totalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		List<Produto> prod = new ArrayList<Produto>(estoqueProdutosMap.values());
		
		Collections.sort(prod, new ComparatorPorPreco());
		
		return prod.get(prod.size()-1);
	}


}
