package CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Collections {
	// List
	public static void main(String[] args) {

		/*
		 * List<String> a1 = new ArrayList<String>(); a1.add("anshuman");
		 * a1.add("kumar"); a1.add("Ray"); a1.add("roy"); a1.add("vimal");
		 * System.out.println(a1.size()); System.out.println(a1.get(2));
		 */

		/*
		 * Map<Integer,String> hmap=new HashMap<Integer,String>(); hmap.put(11,
		 * "kumar"); hmap.put(10, "roy"); hmap.put(21, "mv"); hmap.put(13, "nk");
		 * hmap.put(110, "ry"); System.out.println(hmap.size());
		 * System.out.println(hmap.get(10));
		 */

		// hasgset
		HashSet<String> hset = new HashSet<String>();
		hset.add("ansh");
		hset.add("Kumar");
		hset.add("anshuman");
		hset.add("Ray");

		System.out.println(hset.size());

		/*
		 * for(String h:hset) { System.out.println(h); }
		 */

		Iterator it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
