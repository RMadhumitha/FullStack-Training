import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter the number1:");
	    int number1 = myObj.nextInt();
	    
	    System.out.println("Enter the number2:");
	    int number2 = myObj.nextInt();
	    
	    System.out.println("Enter the number3:");
	    int number3 = myObj.nextInt();
	    
	    System.out.println("Enter the number4:");
	    int number4 = myObj.nextInt();
	    
	    System.out.println("Enter the number5:");
	    int number5 = myObj.nextInt();
	    
	    int sum=0;
	    int avg=0;
	    sum=number1+number2+number3+number4+number5;
	    System.out.println(sum);
	    	
	    avg=sum/5;
	    System.out.println(avg);
	    


	}

}
