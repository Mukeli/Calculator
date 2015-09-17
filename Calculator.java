import java.util.Scanner;

public class Calculator{

	// Finding the sum of two numbers
	public static void add(){
		System.out.println(" Enter your First Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println(" Enter your Second Number");
		int num2 = in.nextInt();
		int sum =+ num1+ num2;
		System.out.println(" The sum is " + sum);
		
	}
	// Finding the subtraction of two numbers
	public static void subtract(){
		System.out.println(" Enter your First Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println(" Enter your Second Number");
		int num2 = in.nextInt();
		int sum =+ num1- num2;
		System.out.println(" The subtraction is " + sum);

	}
	// 	Finding the product of two numbers
	public static void multiply(){
		System.out.println(" Enter your First Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println(" Enter your Second Number");
		int num2 = in.nextInt();
		int product = num1 * num2;
		System.out.println(" The Product is " + product);
		
	}
// Finding the division of two numbers
	public static void divide(){
		System.out.println(" Enter your First Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println(" Enter your Second Number");
		int num2 = in.nextInt();
		int divide = num1 / num2;
		System.out.println(" The Division is " + divide);
		
	}
//Finding the average of two numbers
	public static void average(){
		System.out.println(" Enter your First Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println(" Enter your Second Number");
		int num2 = in.nextInt();
		int sum =+ num1+ num2;
		int average = sum / 2;
		System.out.println(" The Average is " + average);
		
	}
//Finding the modulus of two numbers
	public static void modulus(){
		System.out.println(" Enter your First Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.println(" Enter your Second Number");
		int num2 = in.nextInt();
		double modulus  = num1 % num2;
		System.out.println(" The Modulus is " + modulus);
		
	}
// Finding the Square Root of a number
	public static void squareRoot(){
		System.out.println(" Enter Number");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		double squareRoot = Math.sqrt(num1);
		System.out.println(" The Square Root 1s " + squareRoot);
		
	}



	
	public static void main( String[] args){
		
		int option;
		Scanner in = new Scanner(System.in);
		


		System.out.println(" Select operation to perform \n 1. Add \n 2. subtract \n 3. Multiply \n 4. Divide \n 5. Average \n 6. Modulus \n 7. Square Root " );
		option = in.nextInt();
		if (option ==1){
			add();
		}else if (option ==2){
			subtract();
		} else if (option ==3){
			multiply();
		}else if (option ==4){
			divide();
		} 
		else if (option ==5){
			average();
		} else if (option ==6){
			modulus();
		} else if (option ==7){
			squareRoot();
		} 



	}
}
