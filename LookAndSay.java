package zohoFirst;

import java.util.Scanner;

public class LookAndSay {
	 public static String lookandsay(String number) {
		StringBuilder result = new StringBuilder();
  
		char repeat = number.charAt(0);

		number = number.substring(1) + " ";
		System.out.println("number : "+number);

		int times = 1;

		for (char actual : number.toCharArray()) {
			if (actual != repeat) {
				result.append(times + "" + repeat);
				times = 1;
				repeat = actual;
			} else {
				times += 1;
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String num = "1";
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
       int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
            System.out.println(num);
			num = lookandsay(num);
 
		}

	}
}
