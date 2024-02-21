
public class ClassCastException {
	public static void main(String[] args) {
		Object i = Integer.valueOf(42);
		System.out.println("Object Value is -- "+i);
		String s = (String)i;
		System.out.println("String value is -- "+s);
	}
}
