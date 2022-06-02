package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		String hello = "Hello bonjour";
		int x = 5;
		Integer y = 6;
		byte z = (byte) x;
		
		System.out.println(hello);
		
		String str = "replace me in here";
		String str1 = str.replace("me", "all");
		int position = str1.indexOf("re", 2);
		System.out.println(position);
		
		String str2 = y.toString();
		String str3 = ((Integer)x).toString();
		System.out.println(str1);
		/*pas besoin de convertir un type primitif vers son type Objet / Wrapper*/
		
		System.out.println("=====================");
		//post-incrementation
		int i = 2;
		int f = i++;
		System.out.println(i);//3
		System.out.println(f);//2
		System.out.println("=====================");
		//i+=2 ==>  i=i+2
		//pre-incrementation
		int a = 2;//3
		int b = ++a;//3
		System.out.println(a);
		System.out.println(b);
		System.out.println("=====================");
		
		//concatener valeur
		System.out.println("bon"+"jour");
		System.out.println("=====================");
		
		//calcule
		int num1 = 5;
		int num2 = 6;
		int result = num1+num2;
		System.out.println(result);
		System.out.println("=====================");
		
		//declaration variable
		float fNum = 4.98f;
		char myChar = 'F';
		boolean bool = true;
		long nLong = 10000000000L;
		double dble = 100.99d;
		System.out.println("=====================");
		
	
		
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("enter your words");
			String strNext = scanner.next();//entré: bonjout le monde
			System.out.println(strNext);//bonjour
			String strNextLine = scanner.nextLine();//entré: bonjout le monde
			System.out.println(strNextLine);//bonjout le monde
			
			scanner.close();
		}catch(Exception e) {
			System.out.println("try again");
		}
		
		System.out.println("=====================");
		
        try(Scanner scanner1 = new Scanner(System.in)) {
			
			System.out.println("Veuillez saisir un premier entier, svp ?");
			int n1 = scanner1.nextInt();
			
			System.out.println("Veuillez saisir un second entier, svp ?");
			int n2 = scanner1.nextInt();
			
			int res = n1 + n2;
			System.out.printf("la somme de %d et de %d vaut %d\n", n1, n2, res);
			
			scanner1.close();
			
		} catch (Exception e) {
			System.out.println("Veuillez rentrer un nombre, svp !");
		}
        
        System.out.println("=====================");
        
        
        
       
	}
	
}
