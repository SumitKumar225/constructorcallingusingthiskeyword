package javaPractice;

public class DefaultNonvoid {
	
	int z;
	public DefaultNonvoid() 
	
	{
		this(2,2);
		System.out.println("I am default constructor");
	}
	public DefaultNonvoid(int a) 
	
	{
		this(1,2,3);
		
		System.out.println("I am one para constructor");
	}
	public DefaultNonvoid(int a,int b) 
	
	{
		this(10);
		System.out.println("I am two para constructor");
	}
	public DefaultNonvoid(int a,int b,int c) 
	
	{
		System.out.println("I am three para constructor");
	}
	public DefaultNonvoid(int a,int b,int c,int d) 
	
	{
		System.out.println("I am four para constructor");
	}

	
	
	public static void main(String[] args) {
		
		DefaultNonvoid x=new DefaultNonvoid();
		
	}
}
