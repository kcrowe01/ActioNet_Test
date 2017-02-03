import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.NavigableSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Question2{
	public static void main(String args[]){
		//An ArrayList was chosen here because it is easy to add elements to
		//and can be randomized using Collections.shuffle()
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i = 1; i < 11; i++){
			l1.add(i);
		}
		Collections.shuffle(l1);
		List<Integer> l2 = new ArrayList<Integer>();
		for(int i = 6; i < 16; i++){
			l2.add(i);
		}
		Collections.shuffle(l2);
		System.out.print("Collection 1: ");
		System.out.println(l1);
		System.out.print("Collection 1 Size: ");
		System.out.println(l1.size());
		System.out.print("Collection 2: ");
		System.out.println(l2);
		System.out.print("Collection 2 Size: ");
		System.out.println(l2.size());
		l1.addAll(l2);
		//A TreeSet was chosen here because it orders all of the elements
		//and does not allow duplicates
		NavigableSet<Integer> set = new TreeSet<Integer>(l1);
		set.remove(8);

		Iterator iter = set.descendingIterator();
		System.out.print("[");
		while(iter.hasNext()){
			System.out.print(iter.next());
			if(iter.hasNext()){
				System.out.print(", ");
			}
		}
		System.out.print("]\nCollection 3 Size: ");
		System.out.println(set.size());

		//A HashMap was chosen here because it provides a key->value mapping
		//and the lookup for the value given a key is constant time
		Map<Integer, String> languages = new HashMap<Integer, String>();
		languages.put(1, "Java");
		languages.put(2, "C++");
		languages.put(3, "Python");
		languages.put(4, "Ruby");
		languages.put(5, "Javascript");
		if(languages.containsKey(1)){
			System.out.println("Key/Value Found: {1, " + languages.get(1) + "}");
		}
		else{
			languages.put(1, "Java");
		}
		Iterator<Map.Entry<Integer, String>> entries = languages.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}"); 
		}
		System.out.print("Collection 4 Size: ");
		System.out.println(languages.size());

	}
}