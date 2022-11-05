package Contacts;
public class PersonContact {
	private String name;
	private String number;
	
	public PersonContact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public PersonContact() {
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "PersonContact [name=" + name + ", number=" + number + "]";
	}
	
}
