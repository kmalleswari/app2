package app2;

public class B 
{
		public static void main(String[] args) 
		{
	      test2();
		  test();
		}
		public static void test()
		{
			System.out.println("test method");
			test3();
		}
		public static void test1()
		{
			System.out.println("test1 method");
		}
		public static void test2()
		{
			System.out.println("test2 method");
		}
		public static void test3()
		{
	      System.out.println("test3 method");
			test1();
		}
}



