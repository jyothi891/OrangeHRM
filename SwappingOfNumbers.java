package Java_LogicalPrograms;

public class SwappingOfNumbers {

	public static void main(String[] args) {

		int a,b,c;
		 // Method - 1 - Using Thrid Variable(C)
	//	a=10;
//		b=20;
//		System.out.println("Before swapping of numbers a:" +a);
//		System.out.println("Before swapping of numbers b:" +b );
//		
//		c=a; //c=10
//		a=b; //a=20
//		b=c; //b=10
//		System.out.println("After swapping of numbers  a:" + a);
//		System.out.println("After swapping of numbers b:" + b);
		
//		  // Method -2 - without using Third Variable
//		a=100;
//		b=200;
//		
//		System.out.println("After swapping of numbers  a:" + a);
//		System.out.println("After swapping of numbers b:" + b);
//		
//		a=a+b; //100+200=300 -->a=300
//		b=a-b; //300-200=-100--->b=100
//		a=a-b; //300-100=200--> a=200
//		
//		System.out.println("After swapping of numbers  a:" + a);
//		System.out.println("After swapping of numbers b:" + b);
		
		  //Method-3 - Using * and / without using third variable
		
		a=10;
		b=20;
		
		System.out.println("Before swapping of numbers  a:" + a);
		System.out.println("Before swapping of numbers b:" + b);
		
		a=a*b ;//10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20
		
		System.out.println("After swapping of numbers... "+a+"  "+b+"");
		//System.out.println("After swapping of numbers b:" + b);
		
				
		
		
		
		
		
		
		
	}

}
