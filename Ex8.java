package JavaCore;

public class Ex8 {
	public static void main(String[] args) {
		System.out.println("the capitalize string: " + capitalizeString("hi i am catdog "));

	}

	static String capitalizeString(String str) {
		String capitalizeStr = "";
		String[] arrWords = str.split(" ");

		for (int i = 0; i < arrWords.length; i++) {
			arrWords[i] = arrWords[i].substring(0,1).toUpperCase() + arrWords[i].substring(1).toLowerCase();
		}
		capitalizeStr = String.join(" ", arrWords);
		return capitalizeStr;

	}
}
