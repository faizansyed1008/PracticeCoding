package forLoopClasses;

public class Loopclass {

	static String[] months = { "(January)", "(Febuary)", "(March)", "(April)", "(May)", "(June)", "(July)", "(August)",
			"(September)", "(October)", "(November)", "(December)" };

	public static void main(String[] args) {

		LoopIt("This is First Loop");
		LoopIt("This is Second Loop");
		LoopIt("This is Third Loop");
		LoopIt("This is Forth Loop");

	}

	static void LoopIt(String label) {

		System.out.println(label);
		int index = 0;
		for (int i = 0; i < label.length(); i++) {

			System.out.print("*");

		}

		System.out.println();
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}
	}

}
