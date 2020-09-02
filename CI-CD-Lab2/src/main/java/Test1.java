
public class Test1 {
	
	public void func(int n)
	{
	 int n1=10;
	 System.out.println(n);
	 System.out.println(n1);
	}
public static void main(String args[])
{
	int b=20;
	System.out.println("Hello SonarQube");
	if(b==10)
	{
		System.out.println("False");
	}
	else
		{
		Test1 obj = new Test1();
	obj.func(20);
		}
}
}
