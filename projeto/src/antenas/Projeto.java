package antenas;

public class Projeto {
	
	private String titulo;
	private String chave;
	private Entrega entregas;

	
	
	public Projeto(String chave, String titulo, Entrega entrega) {
		this.chave = chave;
		this.titulo = titulo;
		this.entregas = entrega;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
