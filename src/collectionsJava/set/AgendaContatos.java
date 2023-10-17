package collectionsJava.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		this.contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(this.contatoSet);
	}
	
	public Set<Contato> pesquisaContatoPeloNome(String nomee) {
		Set<Contato> contatoPorNome = null;
		var filter = this.contatoSet
				.stream().filter(x -> x.getNome().startsWith(nomee));
		contatoPorNome = filter.collect(Collectors.toSet());
		
		return contatoPorNome;
	}
	
	public Contato atualizarNumeroContato(String nomee, int novoNumero) {
		Contato contatoAtualizado = null;
		
		contatoAtualizado = contatoSet
				.stream().filter(x->x.getNome().equalsIgnoreCase(nomee))
						.findFirst().get();
		if(contatoAtualizado != null)
			contatoAtualizado.setNumero(novoNumero);
		
		return contatoAtualizado;
	}
	
	

}
