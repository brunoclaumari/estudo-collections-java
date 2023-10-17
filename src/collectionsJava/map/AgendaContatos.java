package collectionsJava.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatos;

	public AgendaContatos() {
		
		this.agendaContatos = new HashMap<String, Integer>();
	}

	public Map<String, Integer> getAgendaContatos() {
		return agendaContatos;
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		getAgendaContatos().put(nome, telefone);
	}
	
	public void removeContato(String nome) {
		if(!agendaContatos.isEmpty()) {
			agendaContatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatos);
	}
	
	public Integer pesquisarPorNome(String nome) {
		if(!agendaContatos.isEmpty()) {
			return agendaContatos.get(nome);
		}
		
		return null;
	}

}
