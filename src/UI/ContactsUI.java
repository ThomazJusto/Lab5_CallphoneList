package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Contacts.ContactsList;
import Contacts.CallRegistry;
import Contacts.PersonContact;

public class ContactsUI {
	private Scanner teclado;
	private CallRegistry CallRegistry = new CallRegistry();
	private ContactsList contactsList = new ContactsList();
	
	public ContactsUI() {
		teclado = new Scanner(System.in);
	}
	
	public void loopMenu() {
		menu();
		boolean condicao = true;
		
		while(condicao) {
			System.out.printf("\nDigite a opção que deseja do menu: ");
			int codigo = teclado.nextInt();
			switch (codigo) {
			case 1:
				cadastrarContato();
				break;
			case 2:
				removerContato();
				break;
			case 3:
				cadastrarNaoAtendida();
				break;
			case 4:
				mostrarNaoAtendida();
				break;
			case 5:
				excluirNaoAtendida();
				break;
			case 6:
				System.out.println("Encerrando...");
				condicao = false;
				break;
			default:
				naoExiste();
				break;
			}
		}
	}
	
	public void menu() {
		System.out.println("[1] - Cadastrar Contato");
		System.out.println("[2] - Remover Contato");
		System.out.println("[3] - Cadastrar Chamada não Atendida");
		System.out.println("[4] - Mostrar Lista de chamadas não atendidas");
		System.out.println("[5] - Excluir todas chamadas não atendidas");
		System.out.println("[6] - Sair");
	}
	
	public void cadastrarContato() {
		System.out.println("Adicionando um contato!");
		System.out.println("Digite o nome da pessoa que queres adicionar: ");
		String name = teclado.next();
		System.out.println("Digite o numero da pessoa que queres adicionar: ");
		String number = teclado.next();
		
		PersonContact person = new PersonContact(name, number);
		
		contactsList.addToList(person);
		System.out.printf("Contato Adicionado!");
	}
	
	public void removerContato() {
		System.out.println("Removendo um contato!");
		System.out.println("Digite o nome da pessoa que queres remover: ");
		String name = teclado.next();
		System.out.println("Digite o numero da pessoa que queres remover: ");
		String number = teclado.next();
		
		
		PersonContact person = new PersonContact(name, number);
		if(contactsList.remover(person)) {
			System.out.println("Contato Removido!");
		}
		else {
			System.out.println("Não foi possível remover o contato.");
		}
		
	}
	
	public void cadastrarNaoAtendida() {
		System.out.println("Adicionando uma chamada não atendida!");
		System.out.println("Digite o numero da pessoa que ligou: ");
		String numeroLigou = teclado.next();
		CallRegistry.addCall(numeroLigou);
	}
	
	public void mostrarNaoAtendida() {
		System.out.println("CHAMADAS NÃO ATENDIDAS");
		CallRegistry.printCallRegistry();
	}
	
	public void excluirNaoAtendida() {
		System.out.println("Excluindo todas chamadas não atendidas");
		CallRegistry.removeAll();
	}
	
	public void naoExiste() {
		System.out.println("Número digitado não existe no Menu. Digite novamente");
	}
}
