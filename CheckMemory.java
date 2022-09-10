public class CheckMemory {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        int data=1024*1024;
        System.out.println("usememory:"+((rt.totalMemory())-(rt.freeMemory()))/data+"mb");
        System.out.println("totalMemory:"+(rt.totalMemory())/data);
        System.out.println("maxmemory:"+(rt.maxMemory())/data);
        byte a = 50;
        //for(byte i=127; i<130; i++){
            //System.out.println(i);
        //}n
    }
}
