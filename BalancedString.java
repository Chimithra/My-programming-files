class Classes{
    void Method(){
        class Meenu{
            void Method2(){
                System.out.println("I am A Meenu");
            }
        }
    }
}
public class BalancedString {
    public static void main(String[] args) {
//        String test = "LLRRLLRLRR";
//        int l=0, r =0, res=0;
//        for(int i=0; i<test.length(); i++){
//            if(test.charAt(i) == 'L'){
//                l++;
//            }
//            else{
//                r++;
//            }
//            if(l == r){
//                res++;
//            }
//        }
//        System.out.println(res);
        Classes c = new Classes();
        c.Method();
    }
}
