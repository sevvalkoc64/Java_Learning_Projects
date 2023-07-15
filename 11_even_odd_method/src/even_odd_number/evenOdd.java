package even_odd_number;

import java.util.Scanner;

public class evenOdd {

	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter element of the array: ");
			int arrayLength= scanner.nextInt();
			scanner.nextLine();
			
			int[] array=new int[arrayLength];
			
			int i;
			for(i=0;i<array.length;i++) {
				System.out.println("enter the array's " +i+". element: ");
				array[i]= scanner.nextInt();
				scanner.nextLine();
			}
			
			for(int x: array) {
				isEvenOrOdd(x);
			}
		}
		
	public static void isEvenOrOdd(int number) {
		if(number%2==0) {
			System.out.println("number: "+number+" is even");
		}
		else {
			System.out.println("number:"+number+" is odd");
		}
	}
}