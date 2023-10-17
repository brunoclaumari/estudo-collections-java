package collectionsJava.map;


public class MainMapContatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstoqueProdutos ep = new EstoqueProdutos();
		
		ep.exibirProdutos();
		
		ep.adicionarProduto(1L, "Produto A", 5.0, 10);
		ep.adicionarProduto(3L, "Produto C", 15.0, 2);
		ep.adicionarProduto(2L, "Produto B", 10.0, 5);
		ep.adicionarProduto(4L, "Produto D", 9.0, 1);
		ep.adicionarProduto(6L, "Produto K", 25.5, 2);
		
		ep.exibirProdutos();
		
		System.out.println("Estoque total: R$ "+ep.calcularTotalEstoque());
		System.out.println("Produto mais caro:  "+ep.obterProdutoMaisCaro());
		
//		AgendaContatos contatos = new AgendaContatos();
//		
//		contatos.exibirContatos();
//		
//		contatos.adicionarContato("Camila", 123456);
//		contatos.adicionarContato("Camila", 5665);
//		contatos.adicionarContato("Camila Cavalcante", 111111);
//		contatos.adicionarContato("Camila DIO", 654987);
//		contatos.adicionarContato("Maria Silva", 111111);
//		contatos.adicionarContato("Camila", 44444);
//		
//		contatos.exibirContatos();
//		contatos.removeContato("Maria Silva");
//		
//		contatos.exibirContatos();
	}

}
