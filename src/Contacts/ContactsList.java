package Contacts;
import java.util.ArrayList;
import java.util.List;

public class ContactsList {
	private static List<PersonContact> ListContacts = new ArrayList<>();
	
	public void addToList(PersonContact contact) {
		ListContacts.add(contact);
	}
	
	public boolean remover(PersonContact contact) {
		for(int i=0; i < ListContacts.size(); i++) {
			if(contact.getNumber().equalsIgnoreCase(ListContacts.get(i).getNumber())) {
				ListContacts.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public static String existe(String numero) {
		for(int i=0; i<ListContacts.size();i++) {
			if(ListContacts.get(i).getNumber().equalsIgnoreCase(numero)) {
				return ListContacts.get(i).getName();
			}
		}
		return numero;
	}
	
	public void printContactList() {
		System.out.println(ListContacts.toString());
	}
	
}
