package exceptions;

public class CheckedExceptionDemo2 {
	public static void main(String[] args)  {
		System.out.println("hello");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Exception Happened");
		}
		System.out.println("Java");
	}
}
