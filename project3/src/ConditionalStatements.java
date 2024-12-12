
public class ConditionalStatements {
	
	public static boolean isEven(int num) {
		boolean status = false;
		if(num % 2 == 0) {
			status = true;
		}
		return status;
	}
	
	public static boolean isOdd(int num) {
		//write code
		return false;
	}
	
	public static void findEvenOrOdd(int num) {
		if(num%2 == 0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}
	
	/*
	if billAmount is > 100 but <= 250,then 5% 
	if billAmount is > 250,but <= 500, then 10% 
	if billAmount is > 500,but <= 750, then 15% 
	if billAmount is > 750,but <= 1000, then 20% 
	if billAmount is > 1000,then 30% 
	*/
	public static double findDiscount(double billAmount) {
		double discount = 0.0;
		
		if(billAmount > 100 && billAmount <= 250) {
			discount = billAmount * .05;//5%
		}else if(billAmount > 250 && billAmount <= 500) {
			discount = billAmount * .1;//10%
		}else if(billAmount > 500 && billAmount <= 750) {
			discount = billAmount * .15;//15%
		}else if(billAmount > 750 && billAmount <= 1000) {
			discount = billAmount * .2;//20%					
		}else if(billAmount > 1000) {
			discount = billAmount * .3;//30%					
		}else {
			discount = 0.0;
		}
		return discount;
	}
	public static void billGenerate(double billAmount) {
		double discount = findDiscount(billAmount);
		System.out.println("Bill Amount: "+billAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Final Bill Amount: "+(billAmount-discount));
	}
	
	public static void calc(int num, String opertion) {
		switch(opertion) {
		case "square":
			System.out.println("Square "+num+" is "+(num*num));
			break;
		case "cube":
			System.out.println("Cube "+num+" is "+(num*num*num));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
		
	public static void main(String[] args) {
		int num = 10;
		String operation = "cube";
		calc(num, operation);
		
		double billAmount = 1000;
		billGenerate(billAmount);		
		
		findEvenOrOdd(10);
		findEvenOrOdd(11);
		findEvenOrOdd(12);
		
		System.out.println(isEven(10));
		System.out.println(isEven(11));
		System.out.println(isEven(12));
	}
}
