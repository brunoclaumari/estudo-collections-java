package collectionsJava.set;

import java.util.HashSet;
import java.util.Set;

public class OperacoesBasicasSet {
	
	private Set<Convidado> convidados;

	public OperacoesBasicasSet() {
		this.convidados = new HashSet<>();
	}

	public Set<Convidado> getConvidados() {
		return convidados;
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {		
		this.convidados.add(new Convidado(codigoConvite, nome));
		
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		
//		if(this.convidados.stream().anyMatch(x->x.getCodigoConvite() == codigoConvite)) {
//			
//		}
		Convidado convidadoParaExcluir = null;		
		
		for (Convidado convidado : convidados) {
			if(convidado.getCodigoConvite() == codigoConvite) {
				convidadoParaExcluir = convidado;
				break;
			}
		}
		
		this.convidados.remove(convidadoParaExcluir);		
	}
	
	public int contarConvidados() {
		
		return this.convidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(this.convidados);		
	}

}
