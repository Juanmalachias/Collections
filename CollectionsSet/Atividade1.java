package CollectionsSet;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> Meuset = new HashSet<Integer>(10);
		int num1,x;
		Scanner ler = new Scanner(System.in);
		
		for (x=0;x<10;x++) {
		System.out.println("\nInsira os numero: ");
		num1 = ler.nextInt();
		Meuset.add(num1);
		}
		System.out.println();
		System.out.println("\nListar dados do Set: ");
		System.out.println(Meuset);
		
		
	}

}
