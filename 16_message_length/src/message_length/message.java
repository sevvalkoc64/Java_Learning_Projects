package message_length;

import java.util.Scanner;

public class message {

	public static void main(String[] args) {
		//max message length is 36
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("please enter a message: ");
		String message= scanner.nextLine();
		
		if(message.length()>36) {
			System.out.println("this message is too long");
			System.out.println("your message should includes maximum 36 characters");
		}
		else {
			System.out.println("your message sent successfully");
		}
	}

}
