class ChildThread extends Thread{
    public void run(){
        for(int i=0; i<5; i++) {
            System.out.println("I am Thread of Run " + i);
        }
    }
}

public class ThreadSample {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        System.out.println(ct.getState());
        ct.start();
        System.out.println(ct.getState());
        for(int i=0; i<5; i++){
            System.out.println("I am in Main "+i);
        }
        System.out.println(ct.getState());
    }
}
