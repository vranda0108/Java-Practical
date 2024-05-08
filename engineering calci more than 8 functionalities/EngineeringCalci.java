class EngineeringCalci{

	public static float add(int a,int b){
		return a+b;
	}
	
	public static float sub(int a,int b){
		return a-b;
	}
	
	public static float multi(int a,int b){
		return a*b;
	}
	
	public static float div(int a, int b) {
        	try {
            		if (b == 0) {
                		throw new ArithmeticException("Division by zero is not possible");
            		} 
            		else {
                		return (float) a / b;
            		}
        	} 
        	catch (ArithmeticException e) {
            		System.out.println(e.getMessage());
            		return 0;
        	}
    	}
    	
	public static float mod(int a,int b){
        	try {
            		if (b == 0) {
                		throw new ArithmeticException("Modulus by zero is not possible");
            		} 
            		else {
                		return (float) a % b;
            		}
        	} 
        	catch (ArithmeticException e) {
            		System.out.println(e.getMessage());
            		return 0;
        	}
    	}
    	
	public static float sq(int a){
		return a*a;
	}
	
	public static float cube(int b){
		return b*b*b;
	}
	
	public static float sqrt(int a) {
		try{
        		if (a < 0) {
            			throw new ArithmeticException("Square root of a negative number is not allowed");
        		}
        		if (a == 0 || a == 1) {
            			return a;
        		}
        		float x = a;
        		float y = 1;
        		while (x - y > 1) {
            			x = (x + y) / 2;
           			y = a / x;
        		}
        		return x;
    		}
    		catch (ArithmeticException e) {
            		System.out.println(e.getMessage());
            		return 0;
        	}
    	}
    	
    	public static float cubert(int a) {
        	try{
        		if (a == 0) {
            		return 0;
        		}
			float x = 1;
        		float xNext = 0;
			do {
            			xNext = (2 * x + a / (x * x)) / 3;
            			if (xNext == x) {
                			break;
            			}
            			x = xNext;
        		} 
        		while (true);
			return x;
    		}
    		catch (ArithmeticException e) {
            		System.out.println(e.getMessage());
            		return 0;
        	}
    	}
    	
    	public static float power(int a, int b) {
        	if (b == 0)
            	return 1;
        	else if (b > 0) {
            		float result = 1;
            		for (int i = 0; i < b; i++) {
                		result *= a;
            		}
            		return result;
        	} 
        	else {
            		return 1 / power(a, -b);
        	}
    	}

	class ComplexNumber{
    		double real;
    		double imaginary;
    		ComplexNumber(double real, double imaginary) {
        		this.real = real;
        		this.imaginary = imaginary;
    		}
    		ComplexNumber add(int num) {
        		return new ComplexNumber(this.real + num, this.imaginary);
    		}
    		ComplexNumber add(ComplexNumber complex) {
        		return new ComplexNumber(this.real + complex.real, this.imaginary + complex.imaginary);
    		}
    		public String toString(){
    			return real + " + " + imaginary + "i";
    		}
	}
	
	class MixedFraction{
		int numerator=6;
		int denominator=4;
		int quotient = numerator / denominator;
        	int remainder = numerator % denominator;
        	public String toString(){
			return quotient + "_|" + denominator + "_|" + remainder; 
		}
	}
	
	public static void main(String args[]){
		EngineeringCalci e=new EngineeringCalci();
		int a=5;
		int b=3;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(multi(a,b));
		System.out.println(div(a,b));
		System.out.println(mod(a,b));
		System.out.println(sq(a));
		System.out.println(cube(b));
		System.out.println(sqrt(a));
		System.out.println(cubert(a));
		System.out.println(power(a,b));
		ComplexNumber c=e.new ComplexNumber(2, 3);
        	ComplexNumber result=c.add(5);
        	System.out.println(result);
        	ComplexNumber c1 =e.new ComplexNumber(4, 5); 
        	ComplexNumber result1=c1.add(c);
        	System.out.println(result1);
        	MixedFraction mf=e.new MixedFraction();
        	System.out.println(""+mf);
	}
}

