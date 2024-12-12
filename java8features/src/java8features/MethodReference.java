package java8features;

@FunctionalInterface
interface Printer{
	void print();
}

public class MethodReference {
	public static void beginPrintJob() {
		System.out.println("print job begins...");
	}	
	public void startPrintJob() {
		System.out.println("print job starts...");
	}	
	public static void main(String[] args) {
		MethodReference m = new MethodReference();		
		Printer p3 = () -> m.startPrintJob();
		p3.print();
		
		//Method Reference with instance method
		Printer p4 = m :: startPrintJob;
		p4.print();
		
		Printer p1 = () -> MethodReference.beginPrintJob();
		p1.print();
		
		//Method Reference with static method
		Printer p2 = MethodReference :: beginPrintJob;
		p2.print();
	}
}
