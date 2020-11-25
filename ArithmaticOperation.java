import java.util.Scanner;

public class ArithmaticOperation {


public static void main(String[] args){
	/////////Task2.1///////////////
	System.out.println("Task2.1 Aritmatic operation...");
Scanner input1 = new Scanner (System.in);
	
	System.out.println("Enter First number");
	
	int x = input1.nextInt();
	
	System.out.println("Enter second number");
	
		int y = input1.nextInt();
	input1.close();
	
	
	int  add, sub,mult,div,mod;

	
	add = x+y;
	sub = x-y;
	mult = x*y;
	div = x/y;
	mod = x%y;
	
	
	
	System.out.println( "X+y =" + add);
	System.out.println("X-y =" + sub);

	System.out.println("X*y =" + mult);

	System.out.println("X/y =" + div);

	System.out.println("X mod y =" + mod);
	
	
	/////////////Task 2.2 relation operators/////////
	
	System.out.println("Task2.2");
	boolean greater, less, greateq, lesseq, equals, noteq;
	greater= x>y;
	 less = x<y;
 greateq= x>=y;
 lesseq = x<=y;
 equals= x==y;
 noteq = x!=y;
 
 
 System.out.println("Numb 1 is > Numb2? : "+ greater );
 System.out.println("Numb 1 is < Numb2? : "+ less);
 System.out.println("Numb 1 is >= Numb2? : "+ greateq );
 System.out.println("Numb 1 is <= Numb2? : "+ lesseq );
 System.out.println("Numb 1 is = Numb2? : "+ equals );
 System.out.println("Numb 1 is != Numb2? : "+ noteq);
 
	///////////////Task2.3///////////////
 
 System.out.println(" arithmetic with assignment operators");
 
	
	 x+=y;
	 System.out.println("X+y =" + x);
	 x-=y;
	 System.out.println("X-y =" + x);
	 x*=y;
	 System.out.println("X*y =" + x);
	 x/=y;
	 System.out.println("X/y =" + x);
	 x%=y;
	System.out.println("X mod y =" + x);
 
}//end main

}//end Class
