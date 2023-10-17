package collectionsJava.set;

import java.util.Objects;

public class Convidado {
	
	private int codigoConvite;
	
	private String nome;

	public Convidado(int codigoConvite, String nome) {		
		this.codigoConvite = codigoConvite;
		this.nome = nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return codigoConvite == other.codigoConvite;
	}

	@Override
	public String toString() {
		return "Convidado [codigoConvite=" + codigoConvite + ", nome=" + nome + "]\n";
	}
	
	

}
