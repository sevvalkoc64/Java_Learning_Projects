package harmonic_series;

import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("enter the n number");
		int n= scanner.nextInt();
		
		double i;
		double harmonic=0;
		for(i=1;i<=n;i++) {
			harmonic= harmonic+(1/i);
		}

		System.out.println("harmonic: "+ harmonic);
	}	
}


