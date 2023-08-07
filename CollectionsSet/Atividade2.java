package CollectionsSet;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> Iset = new HashSet <Integer>(10);
		int x, numb1,numb2;
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<10;x++) {
			System.out.println("\nInsira os numero: ");
			numb1 = leia.nextInt();
			Iset.add(numb1);
		}
		System.out.println("Digite o número que você deseja encontrar: ");
		numb2 = leia.nextInt();
		if (Iset.contains(numb2)) {
			System.out.println("O número "+numb2+ " foi localizado!");
		}else {
			System.out.println(" número "+numb2+ " não foi encontrado!");
		}
	}

}
