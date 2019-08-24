package ourFirstJavaProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("faizan");
		list.add("ali");
		list.add("syed");

		System.out.println(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String obj : list) {
			System.out.println(obj);
			System.out.println("==========Iterating Collection through others ways example");
		}
		System.out.println("Traversing list through list iterator");
		// here element iterates in reverse order
		ListIterator<String> list1 = list.listIterator(list.size());

		while (list1.hasPrevious()) {
			String str = list1.previous();
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// the forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> System.out.println(a)); // here we are using lambda expression

		System.out.println("Traversing list through forEach() method:");
		Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(b -> System.out.println(b));// here we are using lambda expression

		System.out.println("==========ArrayList Examples to ADD Elements");

		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Intial list of elements:" + al);

		// Adding elements to the end of the list
		al.add("Faizan");
		al.add("Ali");
		al.add("Syed");
		System.out.println("After invoking add method: " + al);

		// Adding an element at the specific position
		al.add(1, "Faizan");
		System.out.println("After invoking add(int index, E element) method: " + al);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Faizan");
		al2.add("Ali Syed");

		// Adding second list elements to the first list
		al.addAll(al2);
		System.out.println("After invoking addAll method: " + al);

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Faizan Ali Syed");
		al3.add("Faizan syed");

		// Adding third list elements to the first list at specific position
		al.addAll(1, al3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + al);

		System.out.println("=======Arraylist Examples to remove elements");

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Faizan");
		al1.add("Ali");
		al1.add("Syed");
		System.out.println("An intial list of elements : " + al1);

		// Removing specific element from Arraylist
		al1.remove("Faizan");
		System.out.println("After invoking remove (object) method: " + al1);

		// Removing element on the basis of specific position
		al1.remove(0);
		System.out.println("After invoking remove(index) method: " + al1);

		// Creating another arraylist
		ArrayList<String> als = new ArrayList<String>();
		als.add("Faizan");
		als.add("Syed");

		// Addding new elements to Arraylist
		al1.addAll(als);
		System.out.println("Updated list: " + al1);

		// removing all the new elements from arraylist
		al1.removeAll(als);
		System.out.println("After invoking removeall() method : " + al1);

		// Removing elements on the basis of specified condition
		al1.removeIf(a -> a.contains("Faizan"));
		System.out.println("After invoking removeif() method: " + al1);

		// Removing all the elements available in the list
		al1.clear();
		System.out.println("After invoking clear() method: " + al1);
		
		
		
		System.out.println("====================ArrayList Examples of retainall method");
		
		ArrayList<String> alc=new ArrayList<String>();
		alc.add("Faizan");
		alc.add("Ali");
		alc.add("Syed");
		
		ArrayList<String> al20=new ArrayList<String>();
		al20.add("Syed");
		al20.add("Faizan");
		
		alc.retainAll(al20);
		
		System.out.println("Iterating the elements after retaining the elements of al2");
		
		Iterator itr1=alc.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
				}
		
		System.out.println("=============ArrayList example of isEmpty() method========" );
		
		ArrayList<String> alsg=new ArrayList<String>();
		
		alsg.add("Honda");
		alsg.add("Toyota");
		alsg.add("Mazda");
		
		System.out.println("Before update: "+alsg.get(1));
		
		//Updating an element at specific position
		alsg.set(1, "Crv");
		
		System.out.println("After update: "+alsg.get(1));
		


	}

}
