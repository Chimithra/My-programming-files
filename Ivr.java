import java.util.Scanner;
import java.util.Stack;

public class Ivr {
    public static void main(String[] args) {
        Stack<String> voice = new Stack<>();
        voice.add("Hii, Welcome you : Please choose your request");
        voice.add("press 1 for the recharge details");
        voice.add("press 2 for the Other Recharge plans");
        voice.add("press 3 for the Details of SMS ");
        voice.add("press 4 for the SMS validation");
        voice.add("press 5 to talk with customer care");
        Scanner in = new Scanner(System.in);
        int index =0;
        index = in.nextInt();
        switch (index){
        }
    }
}
