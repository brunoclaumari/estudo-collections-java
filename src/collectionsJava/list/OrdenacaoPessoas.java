package collectionsJava.list;

import collectionsJava.set.AgendaContatos;

public class OrdenacaoPessoas {

	public static void main(String[] args) {
		
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.exibirContatos();
		
		contatos.adicionarContato("Camila", 123456);
		contatos.adicionarContato("Camila", 0);
		contatos.adicionarContato("Camila Cavalcante", 111111);
		contatos.adicionarContato("Camila DIO", 654987);
		contatos.adicionarContato("Maria Silva", 111111);
		
		contatos.exibirContatos();
		
		//System.out.println(contatos.pesquisaContatoPeloNome("Camila"));
		System.out.println(contatos.atualizarNumeroContato("Camila DIO", 555555));
		
		contatos.exibirContatos();
		
//		OperacoesBasicasSet sets = new OperacoesBasicasSet();		
//		System.out.println("Existem " + sets.contarConvidados()+" convidado(s) do Set de convidados");
//		
//		sets.adicionarConvidado("Convidado 1", 1234);
//		sets.adicionarConvidado("Convidado 2", 1235);
//		sets.adicionarConvidado("Convidado 3", 1235);
//		sets.adicionarConvidado("Convidado 4", 1236);
//		
//		System.out.println("Existem " + sets.contarConvidados()+" convidado(s) do Set de convidados");
//		sets.exibirConvidados();
		
//		OrdenaPessoa ord = new OrdenaPessoa();
//		ord.adicionarPessoa("Nome 1", 20, 1.56);
//		ord.adicionarPessoa("Nome 2", 30, 1.80);
//		ord.adicionarPessoa("Nome 3", 25, 1.70);
//		ord.adicionarPessoa("Nome 4", 17, 1.56);
//		
//		//System.out.println(ord.getListaPessoas());
//		
//		System.out.println(ord.ordenarPorIdade());
//		System.out.println(ord.ordenarPorAltura());

	}

}
