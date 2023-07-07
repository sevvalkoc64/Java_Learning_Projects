import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class pass {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter your name");
		String name= scanner.nextLine();
		
		System.out.println("enter your surname");
		String surname= scanner.nextLine();
		
		System.out.println("enter your lesson");
		String lesson= scanner.nextLine();
		
		System.out.println("enter your first exam point");
		double point= scanner.nextDouble();
		
		System.out.println("enter your second exam point");
		double point2= scanner.nextDouble();
		
		double average= (point*0.4)+(point*0.6);
		
		if (average>=60) {
			System.out.println("congratulations! you passed the class");
		}
		else {
			System.out.println("sorry, you failed the class");
		}

	}

}
