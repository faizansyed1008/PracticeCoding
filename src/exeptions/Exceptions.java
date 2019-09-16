package exeptions;

public class Exceptions {

	public static void main(String[] args) {
//		String str = "welcome";
//
//		char[] chars = str.toCharArray();
//		try {
//			for (int i = 0; i <= chars.length; i++) {
//				char c = chars[i];
//				System.out.println(c);
//			}
//
//		} catch (Exception e) {
//
//			System.out.println("Array index Problem");
//		}

		String str = "welcome!";

		char[] chars = str.toCharArray();

		try {
			System.out.println();

			char lastChar = chars[chars.length - 1];
			System.out.println(lastChar);

			String substr = str.substring(10);
			System.out.println(substr);

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index problem");

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Problem");
		}

	}

}

























