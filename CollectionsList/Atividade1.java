package CollectionsList;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		List<String> Cores = new ArrayList<String>();
		String cor;
		char Resposta;
		
		do {
		System.out.println("\n\t\tLista de Cores ");
		System.out.println("\nDesejar adicionar cores:  (S/N)");
		Resposta = leia.next().charAt(0);
		
		
		switch (Character.toUpperCase(Resposta)) {
		case 'S':
			leia.nextLine();
			System.out.println("\nEscreva o nome da cor: ");
			cor = leia.nextLine();
			if (Cores.contains(cor)) {
					System.out.println("\nCor já está armazenada ");
				}else {
					Cores.add(cor);
				}break;
		case 'N':
			  System.out.println("\nObrigado por usar nosso sistema de cores ");
              break;
		default:
            System.out.println("\nResposta inválida. Digite S para adicionar cores ou N para sair.");
			
			
		}
		System.out.println("\n\n" +Cores);
		Collections.sort(Cores);
		System.out.println("\nCores organizadas...");
		System.out.println("\n\n" +Cores);
		System.out.println();
		
	}while (Character.toUpperCase(Resposta)!='N');
	}

}
