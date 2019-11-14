package antenas;

public class CADI {
	private String matricula;
	private String nome;
	private DadosLogin dadosLogin;
	
	public CADI(String matricula, String nome, DadosLogin dadosLogin) {
		this.matricula = matricula;
		this.nome = nome;
		this.dadosLogin = dadosLogin;
	}
	
		
	//GET E SETTERS
	
	
	public String getMatricula() {
		return matricula;
	}
	
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
