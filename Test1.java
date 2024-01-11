import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter the number:");
	    int number = myObj.nextInt();
	    
	    if(number!=0)
	    {
	    	if(number>0)
		    {
		    	System.out.println("Positive number!");
		    }
		    else
		    {
		    	System.out.println("Negative number!");
		    }
	    }
	    else
	    {
	    	System.out.println("The number is neither positive nor negative! \nThe number is zero!!!! ");
	    }
	    


	}

}
