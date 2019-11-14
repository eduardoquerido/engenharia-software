package antenas;

import java.util.LinkedList;
import java.util.List;

public class Entrega {
	
	private String descricao;
	private String linkRep;
	private String linkCloud;
	private List<String> alunos = new LinkedList<String>();
	
	public Entrega(String descricao, String linkRep, String linkCloud, List<String> alunos) {
		this.descricao= descricao;
		this.linkRep = linkRep;
		this.linkCloud = linkCloud;
		this.alunos = alunos;
	}
	
	//Adicionar o email do aluno à entrega;
	
	
	public List<String> getAlunos() {
		return alunos;
	}
	
	public void entregaAluno(String email) {
		alunos.add(email);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getLinkRep() {
		return linkRep;
	}
	
	public void setLinkRep(String linkRep) {
		this.linkRep = linkRep;
	}
	
	public String getLinkCloud() {
		return linkCloud;
	}
	
	public void setLinkCloud(String linkCloud) {
		this.linkCloud = linkCloud;
	}
	
	

}
