
public interface Calc {
	public static final double PI_VALUE = 3.14;	
	
	public abstract int sum(int x, int y);
	public abstract int sub(int x, int y);
	public abstract int mul(int x, int y);
	public abstract int div(int x, int y);
	
	//Default methods from Java 8
	public default int findSquare(int x) {
		return x * x;
	}
	public default int findCube(int x) {
		return x * x * x;
	}
	
	//static methods from java 8
	public static int doubleIt(int x) {
		return x + x;
	}		
}
