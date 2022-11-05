package Contacts;

import java.util.ArrayList;
import java.util.List;

public class CallRegistry {
	private List<String> CallRegistry = new ArrayList<>();

	
	public void addCall(String num) {
		CallRegistry.add(num);
	}
	
	public void removeAll() {
		CallRegistry.clear();
	}
	
	public void printCallRegistry() {
		for(int i = 0; i < CallRegistry.size(); i++) {
			
			
		}
	}
	
}
