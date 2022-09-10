package zohoFirst;
import java.util.ArrayList;


class new1{
	public static void main(String[] args){

        // create an arraylist
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumber1 = new ArrayList<>();
 

        // add elements to arraylist
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("Odd Number ArrayList: " + oddNumbers);
        oddNumber1.add(3);
        oddNumber1.add(2);
        oddNumber1.add(4);

        // remove all elements
        oddNumbers.removeAll(oddNumber1);
        System.out.println("ArrayList after removeAll(): " + oddNumbers);
    }
}
