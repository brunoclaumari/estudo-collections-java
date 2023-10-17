package collectionsJava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;;

public class OrdenaPessoa {
	
	private List<Pessoa> listaPessoas;	
	

	public OrdenaPessoa() {		
		this.listaPessoas = new ArrayList<>();
	}


	public List<Pessoa> getListaPessoas() {
		return listaPessoas;
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		
		Pessoa pessoa = new Pessoa(nome, idade, altura);
		this.listaPessoas.add(pessoa);
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(getListaPessoas());
		
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<Pessoa>(getListaPessoas());
		
		Collections.sort(pessoasPorAltura, new ComparatorAltura());
		
		return pessoasPorAltura;
	}
	

}
