import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cadastro cadastro1 = new Cadastro();
		String aux;
		int i=1;
		
		while(i==1) {
			
			cadastro1.cadastraProprietario();
			cadastro1.cadastraPet();
			
			System.out.println("Deseja continuar cadastrando novos proprietarios? (sim/nao)");
			aux = sc.nextLine();
			
			if(aux.equals("nao")) {
				break;
			}
		}
		System.out.println("Digite o nome completo do pet que deseja consultar: ");
		aux = sc.nextLine();
		
		cadastro1.consultaPet(aux);
		System.out.println();
		cadastro1.mostraPets();		
	}
}
