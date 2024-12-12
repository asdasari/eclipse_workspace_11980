class Parent{
	public void study() {
		System.out.println("Medicine");
	}
}
class Child extends Parent{
	public void study() {
		System.out.println("Acting");
	}
}
public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.study();
		
		Child c = new Child();
		c.study();
		
		Parent p2 = new Child();
		p2.study();
	}
}


