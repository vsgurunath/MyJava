class Main {
	public static void main(String args[]) {
		// Your code goes here
		/*
		//+ will perform addition if both operands are numbers
		//+ will perform concatenation if at least one of the operands is string
		System.out.println("23"+ "34");
		System.out.println(23+34);
		System.out.println("23"+34);	
		*/
		
		/*
		//the statement is processed from left to right
		System.out.println("123" + 4 + 5); 
		//"123" + 4 --> 1234
		//"1234" + 5 --> 12345
		System.out.println(1 + 2 + "234");
		System.out.println(1 + 2 + "234" + 5);
		System.out.println(2 - 1 + "345" + 6);
		//System.out.println(2 - 1 - "345" + 6 - 3); //fails as '-' is not a valid operator here
		*/
		
		/*
		//BODMAS
		System.out.println("123"+(4+5)); //bracket takes priority --> 4+5 is calculated first
		System.out.println("123"+4*5); //multiplication takes priority
		//System.out.println(("123" + 4) * 5); //error
		System.out.println(12*3 + " Hey there " + 5 + 9);
		*/
		
		/*
		*/
		//variables and data types
		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println("The sum " + a + " and " + b + " is: " + sum);
		
	}
}