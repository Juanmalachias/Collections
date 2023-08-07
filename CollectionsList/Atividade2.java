package CollectionsList;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0,numero,numero2, posição;
		
		Scanner leia = new Scanner(System.in);
		
		List<Integer> vetor = new ArrayList <Integer>(10);
		
		for (x=0;x<10;x++) {
			System.out.println("\nInsira os numeros no vetor");
			numero = leia.nextInt();
			vetor.add(numero); 
		}	
		System.out.println("\nvetor"+vetor);
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero2 = leia.nextInt();
		if (vetor.contains(numero2)) {
			posição = vetor.indexOf(numero2);
			System.out.println("O número "+numero2+ " está localizado na posição: "+posição);
		}else {
			System.out.println("O número " + numero2 + " não foi encontrado.");
		}
		
	}

}
