package Celular;

import java.util.ArrayList;
import java.util.List;


public class ListaDeChamadas {
	private List<String> RegistroDeChamadas = new ArrayList<>();
	
	public boolean adicionarChamada(String num) {
		if(num.equalsIgnoreCase("")) {
			return false;
		}
		else {
			this.RegistroDeChamadas.add(num);
			return true;
		}
	}
	
	public boolean removerTudo() {
		RegistroDeChamadas.clear();
		return true;
	}
	
	public List<String> getRegistroDeChamadas() {
		return RegistroDeChamadas;
	}
	
}
