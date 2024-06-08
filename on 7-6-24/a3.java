/*write a java program enter employee salary at runtime by using bufferreader
class and findout the gross salary where ta,da,hra is 10%,20%,30% of salary.*/
class Salary
{
	public static void main(String[] args) throws Exception
	{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		System.out.println("Enter Salary");
		double sal = Double.parseDouble(br.readLine());

		double ta,da,hra,gross;

		ta = sal*0.10;
		da= sal*0.20;
		hra = sal*0.30;
		gross = sal+ da + ta + hra;

		System.out.println("total salary is :"+ta);
		System.out.println("da is : "+da);
		System.out.println("hra is :"+hra);
		System.out.println("gross is :"+gross);	
	}
}