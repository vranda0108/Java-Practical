class mixedfraction{
	//int quotient;
	//int remainder;
	int numerator=6;
	int denominator=4;
	int quotient = numerator / denominator;
        int remainder = numerator % denominator;

	/*public static int mix(int numerator,int denominator){
	int quotient;
	int remainder;
		int quotient = numerator / denominator;
        	int remainder = numerator % denominator;
        	System.out.println(""+quotient + "_|" + denominator + "_|" + remainder);
        	System.out.println(""+this);
        	return 0;
	}
	{
        	System.out.println(""+this);
	}*/
	
	public String myToString(){
		return numerator + / +"_|"+ denominator; 
	}
	
	public String toString(){
		return quotient + "_|" + denominator + "_|" + remainder; 
	}

	public static void main(String args[]){
		mixedfraction mf=new mixedfraction();
		//mf.mix(6,2);
		System.out.println(""+mf);
		System.out.println(""+mf.myToString());
	}
}
