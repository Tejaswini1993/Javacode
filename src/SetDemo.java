import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> s= new HashSet<>();
		s.add("Nita");
		s.add("gita");
		s.add("Nilam");
		s.add("Nil");
		
		for (String val : s) {
			System.out.println(val);
			
		}
		String name="nil";
		s.remove(name);
		System.out.println("===============================");
		for (String val : s) {
			System.out.println(val);
			
		}
		
		
		
	}

}
