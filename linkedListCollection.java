//import java.util.Iterator;
import java.util.*;
//import java.util.ArrayList;


class Student1{
    String Name;
    int Age;
    int Roll_no;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public int getRoll_no() {
        return Roll_no;
    }
    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }
}

public class linkedListCollection {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = in.nextInt();
        LinkedList<Object>lists= new LinkedList<>();
        System.out.println("Enter the no of Students : ");
        int m= in.nextInt();
        switch(n) {
            case 1://students details
                for(int i=0; i<m; i++) {
                    LinkedList<Object>list=new LinkedList<>();
                    System.out.println("Enter the details : ");
                    String name = in.next();
                    int age = in.nextInt();
                    int roll_no = in.nextInt();
                    Student1 s1 = new Student1();
                    s1.setName(name);
                    s1.setAge(age);
                    s1.setRoll_no(roll_no);
                    System.out.printf("Name    : %s \n",s1.getName());
                    System.out.printf("Age     : %d \n",s1.getAge());
                    System.out.printf("Roll_no : %d \n",s1.getRoll_no());
                    list.add(name);
                    list.add(age);
                    list.add(roll_no);
                    lists.add(i,list);
                    //System.out.println(lists.get(i));
                    System.out.println(lists.get(i));
                }
            case 2:// Index get
                System.out.println("Enter the index: ");
                int i = in.nextInt();
                System.out.println(lists.get(i));
            case 3:// Roll no get
                LinkedList<Integer>roll= new LinkedList<>();
                for(i=0; i<m; i++) {
                    System.out.println("Enter the roll "+i+":");
                    int Roll=in.nextInt();
                    roll.add(Roll);
                }
                System.out.println("Enter the search : ");
                int search = in.nextInt();
                for(i=0; i<m; i++) {
                    if(search == roll.get(i)) {
                        System.out.println("Name : "+lists.get(i));
                    }
                }
            case 4:// deletion of 2 index
                System.out.println("Enter the value for delete : ");
                i = in.nextInt();
                lists.remove(i);
                System.out.println(lists);
            case 5://copy of arraylist
                LinkedList<Object>list1= new LinkedList<>();
                list1.add(lists.clone());
                System.out.println("cloned array : "+list1);
                for(i=lists.size()-1; i>=0; i--) {
                    System.out.println("reverse index : " + lists.get(i));
                }
            case 6://shuffle arrayList
                Collections.shuffle(lists);
                Iterator it = lists.iterator();
                while(it.hasNext()){
                    System.out.print(it.next());
                }
                System.out.println();
            case 7://portion of array
                for(i=0;i< lists.size();i++){
                    for(int j=0; j<1;j++){
                        System.out.println(lists.get(i));
                    }
                }
        }

    }

}


