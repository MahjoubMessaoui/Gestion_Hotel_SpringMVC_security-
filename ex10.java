package exercice;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in); 
		int i;
		int som;
		i=0;
		som=0;

		do{
			System.out.println("entrer le nb n ");
			int n=sc.nextInt();
			som+=n;
			i++;
		}
		
		while(i<4) ;
			
		
		System.out.println("le somme est " +som);
	}

}
