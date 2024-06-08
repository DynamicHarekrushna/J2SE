/*write a java program to enter two short number by runtime using Scanner
class and wap between then without using third variable*/
class Swap
{
	public static void main(String[] args) 
	{
		java.util.Scanner give= new java.util.Scanner(System.in);
		System.out.println("Enter number to swap:");
		int number1 = give.nextShort();
		System.out.println("Enter number2 to swap ");
		int number2 = give.nextShort();

		System.out.println("before swap: number1 is:"+number1+"  number2 is:"+number2);
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		System.out.println();
		System.out.println("After swap: number1 is:"+number1+"  number2 is:"+number2);

	}
}