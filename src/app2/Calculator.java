package app2;

public class Calculator 
{
	public static void main(String[] args)
		{
			Calculator c = new Calculator();
			c.add(20,30);
			c.sub(30,20);
			c.mul(3,5);
		}
		public void add(int i, int j)
		{
			int k = i+j;
			System.out.println("k value is : "+k);
		}
		 public void sub(int i, int j)
		{
			int k = i-j;
				System.out.println("k value is: "+k);
		}
		     public void mul(int i, int j)
		{
			int k = i*j;
			System.out.println("k value is: "+k);
		}
}