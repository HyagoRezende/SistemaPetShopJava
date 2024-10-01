import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
	
	Scanner sc = new Scanner(System.in);
	
	int n;
	private String codigo, nome,cpf,endereco,especie,idade, aux;
	private Proprietario dono;
	private Pet p1;
	private ArrayList<Proprietario> proprietarios = new ArrayList();
	private ArrayList<Pet> pets = new ArrayList();
	
	public void cadastraProprietario() {
		
		System.out.println("Digite um novo codigo referente ao proprietario: ");
		codigo = sc.nextLine();
		
		System.out.println("Digite o nome completo do proprietario: ");
		nome = sc.nextLine();
		
		System.out.println("Entre com o CPF do proprietario: ");
		cpf = sc.nextLine();
		
		System.out.println("Digite o endereco do proprietario: ");
		endereco = sc.nextLine();
		
		dono = new Proprietario(codigo,nome,cpf,endereco);
		proprietarios.add(dono);
				
	}
	
	public void cadastraPet() {
		
		System.out.println("Digite um novo codigo referente ao pet: ");
		codigo = sc.nextLine();
		
		System.out.println("Digite a especie do novo pet: ");
		especie = sc.nextLine();
		
		System.out.println("Digite o nome do pet: ");
		nome = sc.nextLine();
		
		System.out.println("Digite a idade do pet: ");
		idade = sc.nextLine();
		
		System.out.println("Digite o nome completo do proprietario do pet: ");
		aux = sc.nextLine();
		
		//descobrir o proprietario referente a esse pet
		n = proprietarios.size();
		for(int i=0; i<n; i++) {
			
			if(aux.equals(proprietarios.get(i).getNome())) {
				dono = proprietarios.get(i);				
			}
			
		}
		
		p1 = new Pet(codigo, especie, nome, idade, dono);
		pets.add(p1);
		
	}
	
	public void mostraPets() {
		
		n = pets.size();
		for(int i=0 ; i<n; i++) {
			System.out.println(pets.get(i).toString());
			System.out.println();
		}
		
	}
	
	public void mostraProprietarios() {
		
		n = proprietarios.size();
		for(int i=0; i<n; i++) {
			System.out.println(proprietarios.get(i).toString());
			System.out.println();
		}
		
	}
	
	public void consultaPet(String aux) {
		
		n = pets.size();
		for(int i=0 ; i<n; i++) {
			
			if(aux.equals(pets.get(i).getNome())) {
				System.out.println(pets.get(i).toString());
			}
			
		}
	
	}
	
	public void consultaProprietario(String aux) {
		
		n = proprietarios.size();
		for(int i=0; i<n; i++) {
			
			if(aux.equals(proprietarios.get(i).getNome())) {
				System.out.println(proprietarios.get(i).toString());
			}
		}
	}
		
	
}
