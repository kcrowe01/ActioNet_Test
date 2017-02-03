import java.util.HashMap;

public class Question3 {
	public static void main(String args[]){
		HashMap<Integer, String> pattern = new HashMap<Integer, String>();
		pattern.put(1, "....1");
		pattern.put(2, "...22");
		pattern.put(3, "..333");
		pattern.put(4, ".4444");
		pattern.put(5, "55555");

		for(int i = 1; i <= 5; i++){
			System.out.println(pattern.get(i));
		}
	}
}