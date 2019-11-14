package antenas;

public class Aluno {
	private String RA;
	private String nome;
	private DadosLogin dadosLogin;

	
		
	public Aluno(String RA, String nome, DadosLogin dadosLogin) {
		this.RA = RA;
		this.nome = nome;
		this.dadosLogin = dadosLogin;
	}
	
	
	//GET E SETTERS
	
	
	public String getRA() {
		return RA;
	}
	
	
	public void setRA(String rA) {
		RA = rA;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public DadosLogin getDadosLogin() {
		return dadosLogin;
	}


	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}

}
