
public class FunctionaInterfaceDemo {
	public static void main(String[] args) {
		Printer p = new EpsonPrinter();
		p.printJob();
		p.scan();
		Printer.threeDPrint();		
	}
}
