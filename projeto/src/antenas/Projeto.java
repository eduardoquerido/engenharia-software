package antenas;

public class Projeto {

	private String chave;
	private Entrega entregas;

	
	
	public Projeto(String chave, Entrega entrega) {
		this.chave = chave;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}	
	
	public Entrega getEntrega() {
		return entregas;
	}
	
	public void setEntrega(Entrega entrega) {
		this.entregas = entrega;
	}	

//Listar Entregas;
	public Entrega listarEntregas(Entrega ent) {
		return ent;		
	}

}
