package ku.util;

/**
 * Main class to test ArrayIterator.
 * 
 * @author Non Puthikanon
 *
 */
public class Main {
	public static void main(String[] args) {
		String[] fruit = { "apple", null, null, "banana" ,"mango",null,"cherry"};
		ArrayIterator<String> it = new ArrayIterator<>(fruit);
		System.out.println(it.next());
		it.remove();
		System.out.println(fruit[0]);
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		

	}
}
