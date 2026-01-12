class AdditionByte

{
	public static void main(String[] args) 
	{
		byte b1 = 5 ;
		byte b2 = 10 ;
		
		//byte add = b1 + b2; //incompatible types: possible lossy conversion from int to byte
		//short add = b1 + b2; //incompatible types: possible lossy conversion from int to short
		int add = b1 + b2; // 15
		
		System.out.println(add);
	}
}

