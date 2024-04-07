package TestNew;
//(((((10+2)+2)-2)*2)/2)
public class Assignment2 {
	public int sum(int a,int b)
	{
		int c= a+b;
		System.out.println("sum of two numbers is " +c);
		return c;
	}
	public int sub(int d,int e)
	{
		int f= d-e;
		System.out.println("sub of two numbers is " +f);
		return f;
	}
	public int mul(int m,int n)
	{
		int l= m*n;
		System.out.println("mulplication of two numbers is " +l);
		return l;
	}
	public int div(int p,int q)
	{
		int r= p/q;
		System.out.println("Division of two numbers is " +r);
		return r;
	}
	
		
	public static void main(String[] args) {
		
		Assignment2 result= new Assignment2();
		int resultsum = result.sum(10, 2);
		int result1 = result.sum(resultsum, 2);
		int subresult= result.sub(result1, 2);
		int mulresult = result.mul(subresult, 2);
		result.div(mulresult, 2);
		
		
	}
}
