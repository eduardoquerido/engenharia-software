package antenas;

import java.util.LinkedList;
import java.util.List;

public class Antenas {

	private List<Empresario> empresarios = new LinkedList<Empresario>();
	private List<Projeto> projetos = new LinkedList<Projeto>();
	private List<CADI> cadis = new LinkedList<CADI>();
	private List<Professor> professores = new LinkedList<Professor>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
//Cadastrar
	public void cadastrarEmpresario(Empresario emp) {
		empresarios.add(emp);
	}	
	
	
	public void cadastrarProjeto(Projeto proj) {
		projetos.add(proj);
	}
	
	
	public void cadastrarProfessor(Professor prof) {
		professores.add(prof);
	}
	
	
	public void cadastrarCADI(CADI cad) {
		cadis.add(cad);
	}
	
	
	public void cadastrarAluno(Aluno alu) {
		alunos.add(alu);
	}
	
	
//GET
	public List<Empresario> getEmpresarios() {
		return empresarios;
	}
	
	public List<Professor> getProfessor() {
		return professores;
	}
	
	public List<CADI> getCADI() {
		return cadis;
	}
	
	public List<Aluno> getAluno() {
		return alunos;
	}
	
	public List<Projeto> getProjeto() {
		return projetos;
	}

	
//Buscar por chave Projeto;	
	public Projeto buscarProjetoPorChave(String chave) {
		for(Projeto projeto:projetos) {
			if(projeto.getChave().equals(chave)) return projeto;
		}
		return null;
	}
	
//Logar Aluno;
	public Aluno loginAluno(DadosLogin dl) {
		for(Aluno aluno:alunos) {
			if(aluno.getDadosLogin().compararDadosLogin(dl)) return aluno;
		}
		return null;
	}
	
//Logar Professor;
	public Professor loginProfessor(DadosLogin dl) {
		for(Professor professor:professores) {
			if(professor.getDadosLogin().compararDadosLogin(dl)) return professor;
		}
		return null;
	}
	
//Logar CADI;
	public CADI loginCADI(DadosLogin dl) {
		for(CADI cadi:cadis) {
			if(cadi.getDadosLogin().compararDadosLogin(dl)) return cadi;
		}
		return null;
	}
	
//Logar Empresario;
	public Empresario loginEmpresario(DadosLogin dl) {
		for(Empresario empresario:empresarios) {
			if(empresario.getDadosLogin().compararDadosLogin(dl)) return empresario;
		}
		return null;
	}
	
//Excluir Aluno;
	public void excluirAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
//Setar Chave
	public void setarChaveProjeto(String titulo, String chave) {
		for(Projeto projeto:projetos) {
			if(projeto.getTitulo().equals(titulo)) {
				projeto.setChave(chave);
			}
		}
	}
	
	


}
