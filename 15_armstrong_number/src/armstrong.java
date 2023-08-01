import java.util.Scanner;

public class armstrong {

public static void main(String[] args) {
        
      Scanner scanner=new Scanner(System.in);
      
      System.out.println("enter a number");
      int number= scanner.nextInt();
   
      int temp=number;
      int temp2=number;
      int armstrong=0;
      int numberOfDigit=0;
      while(temp>0) {
    	  temp/=10;
    	  numberOfDigit++;
      }

      int digit;
      while(temp2>0) {
    	  digit=temp2%10;
    	  armstrong+=digit^numberOfDigit;
    	  temp2/=10;
      }
      
      if(armstrong==number) {
    	  System.out.println("it is an armstrong number");
      }
      else {
    	  System.out.println("it is not an armstrong number");
      }
}

}
