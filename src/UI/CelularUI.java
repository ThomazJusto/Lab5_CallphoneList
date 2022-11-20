package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Celular.Contato;
import Celular.ListaContatos;
import Celular.ListaDeChamadas;


public class CelularUI {
	private Scanner teclado;
	private ListaDeChamadas listaChamadas = new ListaDeChamadas();
	private ListaContatos listaContatos = new ListaContatos();
	
	public CelularUI() {
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
		String nome = teclado.next();
		System.out.println("Digite o numero da pessoa que queres adicionar: ");
		String numero = teclado.next();
		
		Contato pessoa = new Contato(nome, numero);
		
		if(listaContatos.adicionaContato(pessoa)) {
			System.out.printf("Contato Adicionado!");
		}
		else {
			System.out.printf("Não foi possível adicionar este contato. Tente novamente!");
		}
	}
	
	public void removerContato() {
		System.out.println("Removendo um contato!");
		System.out.println("Digite o nome da pessoa que queres remover: ");
		String nome = teclado.next();
		System.out.println("Digite o numero da pessoa que queres remover: ");
		String numero = teclado.next();
		
		
		Contato pessoa = new Contato(nome, numero);
		if(listaContatos.removerContato(pessoa)) {
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
		if(listaChamadas.adicionarChamada(numeroLigou)) {
			System.out.printf("Chamada não atendida foi adicionada à lista");
		}
		else {
			System.out.printf("Não foi possível adicionar a chamada. Tente novamente.");
		}
	}
	
	public void mostrarNaoAtendida() {
		System.out.println("-- CHAMADAS NÃO ATENDIDAS --");
		List<String> lista = listaChamadas.getRegistroDeChamadas();
		Contato c = null;
		
		if(lista.isEmpty()) {
			System.out.println("Nenhuma chamada não atendida");
		}
		else {
			for(int i=0; i<lista.size();i++) {
				c = listaContatos.verificaExistencia(lista.get(i));
				if(c != null) {
					System.out.println("- "+ c.getNome());
				}
				else {
					System.out.println("- "+ lista.get(i));
				}
			}
		}
		System.out.println("----------------------------");
		
	}
	
	public void excluirNaoAtendida() {
		System.out.println("Excluindo todas chamadas não atendidas");
		if(listaChamadas.removerTudo()) {
			System.out.println("Todas chamadas removidas com sucesso!");
		}
		else {
			System.out.println("Não foi possível remover as chamadas. Tente novamente.");
		}
	}
	
	public void naoExiste() {
		System.out.println("Número digitado não existe no Menu. Digite novamente");
	}
}
