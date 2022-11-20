package CelularTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import Celular.ListaDeChamadas;

class ListaDeChamadasTeste {
	ListaDeChamadas lista = new ListaDeChamadas();
	
	
	@Test
	void adicionarChamadaValida() {
		assertTrue(lista.adicionarChamada("1232345"));
		assertTrue(lista.adicionarChamada("324266432"));
		assertTrue(lista.adicionarChamada("5462323"));
	}
	
	@Test
	void adicionarChamadaInvalida() {
		assertFalse(lista.adicionarChamada(""));
	}
	
	@Test
	void testaSeRemoveTudo() {
		assertTrue(lista.removerTudo());
	}
	
	@Test
	void testaSeListaTemChamadas() {
		assertEquals(lista.getRegistroDeChamadas().size(), 0);
	}

}
