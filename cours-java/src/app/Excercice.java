package app;

import java.util.Scanner;

public class Excercice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		/*System.out.println("saisez des chiffre");
		int x = scn.nextInt();
		int y = x%2;
		if(y == 0 ) {
			System.out.println(x+" est nombre paire");
		}else {
			System.out.println(x+" est nombre impaire");
		}
		System.out.println("1 FINI ******************");
		
		System.out.println("veuillez entrer 3 nombre entier");
		System.out.println("entrez nombre a");
		int a = scn.nextInt();
		System.out.println("entrez nombre b");
		int b = scn.nextInt();
		System.out.println("entrez nombre c");
		int c = scn.nextInt();
		if(a>b && a>c ) {
			System.out.println("a est le plus grand nombre");
			
		}else if(b>a && b>c) {
			System.out.println("b est le plus grand nombre");
			
		}else{
			
			System.out.println("c est le plus grand nombre");
		}
		// new method
		
		System.out.println("2 FINI ******************");
		
		System.out.println("entrez grand nombre");
		long mnt = scn.nextLong();
		long jrs = mnt/60/24;
		long ans = jrs/365;
		System.out.println(mnt+" minutes equal "+jrs+"jours");
		System.out.println(mnt+" minutes equal "+ans+"ans");*/
		
		System.out.println("3 FINI ******************");
		
		double rate = 1.25;
		double eur;
		System.out.println("entrez un somme de dollars à convertir en euro");
		double dol = scn.nextDouble();
		System.out.println(dol+" dollar "+ "equal en "+dol/rate+" euros");
				
		scn.close();
	}

}
