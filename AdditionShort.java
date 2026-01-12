class AdditionShort 
{
	public static void main(String[] args) 
	{
		short s1 = 300;
		short s2 = 500;
		
		//short add = s1 + s2 ; // error: incompatible types: possible lossy conversion from int to short
		int add = s1 + s2 ; //800
		System.out.println(add); 
	}
}
