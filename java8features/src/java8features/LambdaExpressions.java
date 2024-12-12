package java8features;

@FunctionalInterface
interface MyFunctionalInterface{
	void greet();
}

@FunctionalInterface
interface MyFunctionalInterface2{
	int findSquare(int num);
}

@FunctionalInterface
interface MyFunctionalInterface3{
	int findSum(int num1, int num2);
}

@FunctionalInterface
interface MyFunctionalInterface4{
	boolean isEven(int num);
}


public class LambdaExpressions {
	public static void main(String[] args) {
		MyFunctionalInterface4 myFun4 = (n) -> n%2 == 0;
		System.out.println(myFun4.isEven(10));
		System.out.println(myFun4.isEven(11));

		MyFunctionalInterface3 myFun3 = (x,y) -> x+y;
		int total = myFun3.findSum(10,20);
		System.out.println(total);
		
		MyFunctionalInterface2 myFun2 = (x) -> x * x;
		int square = myFun2.findSquare(10);
		System.out.println(square);		
		
		MyFunctionalInterface myFun = () -> System.out.println("Hello...");
		myFun.greet();
	}
}
