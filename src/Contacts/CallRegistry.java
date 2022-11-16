package Contacts;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class CallRegistry {
	private List<String> CallRegistry = new ArrayList<>();
	
	public void addCall(String num) {
		
			
			
			
		this.CallRegistry.add(num);
	}
	
	public void removeAll() {
		CallRegistry.clear();
	}
	
	public void printCallRegistry() {
		if(CallRegistry.isEmpty()) {
			System.out.println("Nenhuma Chamada não atendida");
		}
		
		for(int i = 0; i < CallRegistry.size(); i++) {
			System.out.println(ContactsList.existe(CallRegistry.get(i)));
		}
	}
}
