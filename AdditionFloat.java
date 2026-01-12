class AdditionFloat 
{
	public static void main(String[] args) 
	{
		float f1 = 1.1f;
		float f2 = 2.2f;
		
		//long add = f1 + f2 ;// error: incompatible types: possible lossy conversion from float to long
		float add = f1 + f2 ; //3.3000002
		System.out.println(add);
	}
}
