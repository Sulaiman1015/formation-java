package app;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		switch(x) {
		case 1:
			System.out.println("un");
			break;
		case 2:
			System.out.println("duex");
			break;
		case 3:
			System.out.println("trois");
			break;
		default:
			System.out.println("autre");
		}
		
		String str = "one";
		
		switch(str) {
		case "one":
			System.out.println("un");
			break;
		case "two":
			System.out.println("duex");
			break;
		case "three":
			System.out.println("trois");
			break;
		default:
			System.out.println("autre");
		}
		
		System.out.println("============");
		
		int u = 0;
		while(u<5) {
			System.out.println("u: "+u);
			u++;
		}
		
		System.out.println("============");
		
		int q = 0;
		do {
			System.out.println("q: "+q);
			q++;
		}
		while(q<5);
		
		System.out.println("============");
		
		for(int index=0;index<5;index++) {
			System.out.println("index: "+index);
		}

		System.out.println("============");
		
		/*try (Scanner scanner = new Scanner(System.in)) {
		// while(true) -> boucle infinie
		// sort de la boucle à l'appel du break, car, quand les conditions sont vraies
		while (true) {
			System.out.println("Entrez votre nom:");
			String nom = scanner.nextLine();
			System.out.println("Entrez votre mot de passe:");
			String password = scanner.nextLine();
			if (nom.equals("Wick") && password.equals("1234")) {
				// Sort de la boucle while
				break;
			}
		}
		System.out.println("Hello John");

	    } catch (Exception e) {
		e.printStackTrace();
	    }*/
    
	    System.out.println("=====================");
	    
	    for(int n=0;n<=10;n++) {
	    	int m=n%2;
	    	if(m == 0) {
	    		System.out.println("n="+n+": "+m);
	    	}
	    }
    		
	}

}
