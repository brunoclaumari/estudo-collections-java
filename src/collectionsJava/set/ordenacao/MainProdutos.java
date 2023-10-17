package collectionsJava.set.ordenacao;

public class MainProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperacoesProduto op = new OperacoesProduto();
		
		op.exibirProdutosPorDescricao();
		
		op.adicionarProduto(1L, "Produto 03", 10.50, 2);
		op.adicionarProduto(3L, "Produto 09", 2.50, 2);
		op.adicionarProduto(1L, "Produto 07", 8.50, 5);
		op.adicionarProduto(4L, "Produto 11", 11.50, 2);
		op.adicionarProduto(2L, "Produto 05", 20.50, 2);
		
		op.exibirProdutosPorDescricao();
		
		op.exibirProdutosPorPreco();

	}

}
