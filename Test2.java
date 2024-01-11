import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter the number:");
	    int number1 = myObj.nextInt();
	    int number2 = myObj.nextInt();
	    int number3 = myObj.nextInt();
	    
	    if(number1>number2 && number1>number3)
	    {
	    	System.out.println("Greatest is "+number1);
	    }
	    else if(number2>number1 && number2>number3)
	    {
	    	System.out.println("Greatest is "+number2);
	    }
	    else
	    {
	    	System.out.println("Greatest is "+number3);
	    }

	}

}
