package hashclass;

import java.util.HashMap;

public class Java_hash2 {

	public static void main(String[] args) {

		HashMap<String, Integer> people = new HashMap<String, Integer>();

		people.put("Faizan is : ", 27);

		for (String a : people.keySet()) {
			System.out.println("" + a + "" + people.get(a));

		}

		for (String b : people.keySet()) {
			System.out.println(b);
		}

		for (Integer c : people.values()) {
			System.out.println(c);
		}

	}

}
