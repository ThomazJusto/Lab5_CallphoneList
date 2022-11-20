package Celular;

import java.util.ArrayList;
import java.util.List;

public class ListaContatos {
	private static List<Contato> ListaDeContatos = new ArrayList<>();
		
	public boolean adicionaContato(Contato contato) {
		return ListaDeContatos.add(contato);
	}
	
	public boolean removerContato(Contato contato) {
		for(int i=0; i < ListaDeContatos.size(); i++) {
			if(contato.getNumero().equalsIgnoreCase(ListaDeContatos.get(i).getNumero()) && contato.getNome().equalsIgnoreCase(ListaDeContatos.get(i).getNome())) {
				ListaDeContatos.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Contato verificaExistencia(String numero) {
		Contato c = null;
		for(int i=0; i<ListaDeContatos.size();i++) {
			if(ListaDeContatos.get(i).getNumero().equalsIgnoreCase(numero)) {
				
				c = ListaDeContatos.get(i);
				return c;
			}
		}
		return c;
	}
	
}
