package CelularTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import Celular.Contato;
import Celular.ListaContatos;

class ListaContatosTeste {
	ListaContatos l = new ListaContatos();;
	Contato c = new Contato("Thomaz", "123");
	Contato d = new Contato("Otto", "12312333");
	Contato e = new Contato("Caua", "324432");
	Contato f = new Contato("test", "234323");
	Contato y = new Contato("Jonathan", "214343");
	Contato w = new Contato("Ricardo", "34355435");
	
	
	@Test
	void adicionaContato() {
		assertTrue(l.adicionaContato(c));
		assertTrue(l.adicionaContato(d));
		assertTrue(l.adicionaContato(e));
		assertTrue(l.adicionaContato(f));
	}
	
	@Test
	void removeContatoPositivo() {
		assertTrue(l.removerContato(f));
		assertTrue(l.removerContato(e));
	}
	
	@Test
	void removeContatoNegativo() {
		assertFalse(l.removerContato(y));
		assertFalse(l.removerContato(w));
	}
	
	
	@Test
	void verificaExistencia() {
		assertEquals(l.verificaExistencia("123").getNome(), "Thomaz");
		assertEquals(l.verificaExistencia("214343"), null);
	}

}
