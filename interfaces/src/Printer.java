/*
Functional Interface = Only 1 abstract method + (default & static methods)
Introduced in java 8
*/
@FunctionalInterface
public interface Printer {
	//Only one abstract method is allowed
	void printJob();//implicitly public abstract
	
	//Any no. of default and static methods are allowed.
	default void scan() {
		System.out.println("scan...");
	}
	
	static void threeDPrint() {
		System.out.println("3D print...");
	}
}
