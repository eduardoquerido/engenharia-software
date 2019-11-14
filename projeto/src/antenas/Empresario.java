package antenas;

public class Empresario {
	private String CPF;
	private DadosLogin dadosLogin;


//GET E SETTERS
	
	public Empresario(String CPF, DadosLogin dadosLogin) {
		this.CPF = CPF;
		this.dadosLogin = dadosLogin;
	}

	public String getCPF() {
		return CPF;
	}
	
	
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public DadosLogin getDadosLogin() {
		return dadosLogin;
	}


	public void setDadosLogin(DadosLogin dadosLogin) {
		this.dadosLogin = dadosLogin;
	}
	
}
