package collectionsJava.map;

import java.util.Objects;

public class Contato {
	
	private String nome;
	
	private int telefone;

	public Contato(String nome, int telefone) {		
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
	

}
