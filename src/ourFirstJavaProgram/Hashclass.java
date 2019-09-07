package ourFirstJavaProgram;

import java.util.HashMap; // import the HashMap class

public class Hashclass {

	public static void main(String[] args) {
		// creating HashMap object
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// to add items
		capitalCities.put("Uyghuryer", "Urumqi");
		capitalCities.put("USA", "Washington DC");
		capitalCities.put("turkiyer", "Istanbul");
		capitalCities.put("Pakistan", "Islamabad");

		System.out.println(capitalCities);

		// calling out individual key/value
		System.out.println(capitalCities.get("Pakistan"));

//		//to remove an item
//		capitalCities.remove("USA");
//		
//		//to remove all items
//		capitalCities.clear();
//		
//		//to get size
//		capitalCities.size();

		for (String a : capitalCities.keySet()) {
		
			System.out.println(a);
		}

		for (String b : capitalCities.values()) {
			System.out.println(b);
			
		}
		for (String c : capitalCities.keySet()) {
			System.out.println("key: " + c + " value: " + capitalCities.get(c));

		}

	}

}
