import java.util.*;

class Try {
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            char c = (char) i;
            arr.add(c);
            for (int j = 0; j < word.length(); j++) {
                if (c == word.charAt(j)) {
                    arr1.add(c);
                }
            }
        }
        for (int j = 0; j < 26; j++) {
            for (int i = 0; i < word.length(); i++) {
                if (arr.get(j) == word.charAt(i)) {
                    num.add(h.get(j));
                }
            }
        }
        Collections.sort(num);
        int greater = num.get(num.size()-1);
        int area = greater * word.length();
        System.out.println(arr.toString());
        System.out.println(arr1.toString());
        System.out.println(num.toString());
        System.out.println(area);
        return area;
    }
}
public class PdfViewer {
    public static void main(String[] args) {
        ArrayList<Integer>h = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<26; i++){
            System.out.println("Enter h : ");
            int s = sc.nextInt();
            h.add(s);
        }
        String word = "zbkkfhwplj";
        Try.designerPdfViewer(h,word);
    }
}
