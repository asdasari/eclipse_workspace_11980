
/*
StringBuilder is mutable 
Not thread safe object
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);		
		sb.append("23");
		System.out.println(sb);
	}
}
