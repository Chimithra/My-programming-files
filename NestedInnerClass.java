class Outer{
    private int X ;
    protected void outerDisplay(){
        System.out.println("Outer Display "+ X);
    }

    /**
     * static inner class cannot access the outer class members
     */
     protected class Inner{
        int Y;
        protected void innerDisplay(){
            System.out.println("Inner Display "+ X);
        }
    }
    static class NextInner {
        int Z;
        void nextInner(){
            System.out.println("I am next Inner"+Z);
        }
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
//       Outer o = new Outer();
//       o.X = 5;
//       o.outerDisplay();
//       Outer.Inner o1 = new Outer.Inner();
//       o1.Y = 10;
//       o1.innerDisplay();
//        Outer.Inner oi = new Outer.Inner();
        Outer.NextInner i = new Outer.NextInner();
    }
}
