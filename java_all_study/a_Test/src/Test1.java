import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		for(int i = 10; i <= 100; i+=10) {
			array.add(i);
		}
		System.out.println(array);

		
		
		array.add(array.indexOf(50) + 1, 500);
		System.out.println(array);
		 
		array.set(array.indexOf(90), 9);
		System.out.println(array);
		
//		array.remove(array.indexOf(80));
		
		array.remove(Integer.valueOf(80));
		System.out.println(array);
		
		
	
	}
}

