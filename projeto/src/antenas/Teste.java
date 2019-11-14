package antenas;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Antenas antenas = new Antenas();
		
	//Cadastro de usuários;
		antenas.cadastrarAluno(new Aluno("3456789654", "Francisco", new DadosLogin("fran@bol.com", "lindinha")));
		antenas.cadastrarAluno(new Aluno("1231515112", "Eduardi", new DadosLogin("eduardo@mail.com", "senhafortedemais")));
		antenas.cadastrarProfessor(new Professor("3216548425", "Lindinha", new DadosLogin("lindinha@fatec.com", "fran")));
		antenas.cadastrarEmpresario(new Empresario("3579518462", new DadosLogin("empresariocomgrana@bol.com", "dinheiroehcumigomemu")));
		antenas.cadastrarCADI(new CADI("3569865345","Jean", new DadosLogin("cadi@bol.com", "cadinho")));
		
	//Tamanho da lista;
		assertEquals(antenas.getEmpresarios().size(), 1);
		assertEquals(antenas.getProfessor().size(), 1);
		assertEquals(antenas.getCADI().size(), 1);
		assertEquals(antenas.getAluno().size(), 2);
				
	//Verificando método de login;
		//Empresario emp = antenas.loginEmpresario(new DadosLogin("empresariobobao@bol.com", "senha"));
		
	//Criando Projetos
		antenas.cadastrarProjeto(new Projeto("chavedobalacubacu", new Entrega("kablau", "www.oi.com", "www.quemsabe.com", new LinkedList<String>())));
		antenas.cadastrarProjeto(new Projeto("projetozika", new Entrega("blablabla", "www.tchau.com", "www.nemvem.com", new LinkedList<String>())));
		antenas.cadastrarProjeto(new Projeto("projetao", new Entrega("blublubla", "www.falou.com", "www.issomesmo.com", new LinkedList<String>())));
		
	//Busca do Projeto;
		Projeto projeto = antenas.buscarProjetoPorChave("projetozika");
		assertEquals(projeto.getChave(), "projetozika");

		Projeto projeto2 = antenas.buscarProjetoPorChave("chavedobalacubacu");
		assertEquals(projeto2.getChave(), "chavedobalacubacu");
		
		Projeto projeto3 = antenas.buscarProjetoPorChave("chavedobalacubacu");
		assertEquals(projeto3.getChave(), "chavedobalacubacu");		
		
	//Verificando getProjetos() - atribuído ao CADI
		assertEquals(antenas.getProjeto().size(), 3);		
		
	//Criando Entrega;
		Entrega entrega = new Entrega("blablabla", "www.rep.com", "www.cloud.com", new LinkedList<String>());
		entrega.entregaAluno("willian@hotmail.com");
		entrega.entregaAluno("eduardo@hotmail.com");
		entrega.entregaAluno("fran@hotmail.com");
		
	//Verificando getAlunos()	
		assertEquals(entrega.getAlunos().size(), 3);
	//Verificarndo getDescricao()
		assertEquals(entrega.getDescricao(), "blablabla");
	//Verificando getLinkRep()
		assertEquals(entrega.getLinkRep(), "www.rep.com");
	//Verificando getLinkCloud()
		assertEquals(entrega.getLinkCloud(), "www.cloud.com");
		
	//Verificando listarEntregas() - atribuido ao Professor e ao Empresário
		Entrega ent = entrega;
		assertEquals(projeto.listarEntregas(ent), entrega);
		
	//Verificando getEntrega() da classe Projeto
		assertEquals(projeto.getEntrega(), entrega);
		

	}

}
