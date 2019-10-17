package model;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {

		Olive olive1 = new Kalamata();
		Olive olive2 = new Kalamata();
		Olive olive3 = new Ligurian();

		
		
		
		List<Olive> oliveList = new ArrayList<>();
	
		
		oliveList.add(olive1);
		oliveList.add(olive2);
		oliveList.add(olive3);

		OlivePress press = new OlivePress();

		int totalOil = press.getOil(oliveList);

		System.out.println("Total oil : " + totalOil);

//        for (Olive olive : oliveList) {
//            System.out.println(olive.name);
//        }
	}
}