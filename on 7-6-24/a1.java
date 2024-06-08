/*Write a java program to enter interger number at runtime by using command
line argumnet and check given number is even or odd.*/

class EvenOdd
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		if(x%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");	
	}
}