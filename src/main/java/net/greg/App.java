package net.greg;

/**
 * count occurence of each letter
 * frequencyMap
 */

public class App {

	public static void main(String ... any) {


		 System.out.println(" I am on my third \u2615");



		App app= new App();

		System.err.println(
			"\nreverseWords " +
			app.reverseWords("eat an apple"));
	}

	public String reverseWords(String value) {

		StringBuilder sb = new StringBuilder();

		String[] arr = value.split(" ");

		for (int i = arr.length - 1; i >= 0; --i) {

			if ( ! arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}

		return sb.length() == 0 ? "" :
			sb.substring(0, sb.length() - 1);
	}
}
