package CelularTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Celular.Contato;

class ContatoTeste {

	@Test
	public void testaInformacoesContato() {
		Contato c = new Contato("Thomaz", "123");
		assertEquals("Thomaz", c.getNome());
		assertEquals("123", c.getNumero());
	}
}
