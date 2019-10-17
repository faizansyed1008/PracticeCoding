package model;

import java.util.List;

public class OlivePress {

	public int getOil(List<Olive> olives) {
		int total = 0;

		for (Olive olive : olives) {
			System.out.println(olive.getName());
			total = total + olive.crush();
		}

		return total;
	}
}