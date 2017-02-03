import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Integer;


/*
 * Still Working on this.
 * Mapping the index to the pattern on each line was 
 * and easy way to duplicate the output with only one
 * control structure but it does not work well for using 
 * n instead of 5
 */ 
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

		//The code below implements this using n instead of 5. It is more condensed than the
		//example but still uses multiple control structures.
		/*
		int n = 6;
		for(int i = 0; i < (int)Math.pow(n, 2); i++){
			int row = (i/n) + 1;
			System.out.print((i%n >= (n-(row))%n) ? Integer.toString(row) : '.');
			if(i%n == n - 1 ) System.out.print("\n");
		} 
		*/
	}
}