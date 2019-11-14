package antenas;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.List;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Antenas antenas = new Antenas();
		
		//Cadastro;
		antenas.cadastrarAluno(new Aluno("3456789654", "Francisco", new DadosLogin("fran@bol.com", "lindinha")));
		antenas.cadastrarProfessor(new Professor("3216548425", "Lindinha", new DadosLogin("lindinha@fatec.com", "fran")));
		antenas.cadastrarEmpresario(new Empresario("3579518462", new DadosLogin("empresariobobao@bol.com", "senha")));
		antenas.cadastrarCADI(new CADI("3569865345","Jean", new DadosLogin("cadi@bol.com", "cadinho")));
		
		//Tamanho da lista;
		assertEquals(antenas.getEmpresarios().size(), 1);
		
		//Cadastro Projeto;
		antenas.cadastrarProjeto(new Projeto("projetozika"));
		antenas.cadastrarProjeto(new Projeto("projetao"));		
		
		//Busca do Projeto;
		Projeto projeto = antenas.buscarProjetoPorChave("projetozika");
		assertEquals(projeto.getChave(), "projetozika");
		
		//Login;
		Empresario emp = antenas.loginEmpresario(new DadosLogin("empresariobobao@bol.com", "senha"));
		
		//Entrega;
		Entrega entrega = new Entrega("blablabla", "www.oi.com", "www.tchau.com", new LinkedList<String>());
		entrega.entregaAluno("willian@hotmail.com");
		entrega.entregaAluno("eduardo@hotmail.com");
		entrega.entregaAluno("fran@hotmail.com");
				
		assertEquals(entrega.getAlunos().size(), 3);
		
		
	}

}
