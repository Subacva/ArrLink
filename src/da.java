import java.util.ArrayList;
import java.util.LinkedList;

public class da {
    private static int D = 100000;
    LinkedList<String> linked = new LinkedList<>();
    ArrayList<String> array = new ArrayList<>();
    
    public static void main(String[] args) {
        da xd = new da();
        System.out.println(xd.BeginningLinkArr() + " " + "Линкед лист в начале");//LL at the beginning
        System.out.println(xd.BeginningLinkArr() + " " + "ARRAY лист в начале");//AL at the beginning
        System.out.println(xd.MiddleLinkArr() + " " + "Линкед лист в центре");//LL at the middle
        System.out.println(xd.MiddleLinkArr() + " " + "ARRAY лист в центре");//AL at the middle
        System.out.println(xd.ArrLinkEnd() + " " + "Линкед лист в конце");//LL at the end
        System.out.println(xd.ArrLinkEnd() + " " + "ARRAY лист в конце");//AL at the end
    }

    public  long BeginningLinkArr() {
        linked = new LinkedList<>();
        array = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            linked.add(0, "Da");
        }
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        long dada = System.nanoTime();

        for (int i = 0; i < D; i++) {
            array.add(0, "Da");
        }
        return System.nanoTime() - startTime;
    }

    public long MiddleLinkArr() {
        linked = new LinkedList<>();
        array = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            array.add(50000, "Da");
        }
        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }
        long dadada = System.nanoTime();
        for (int i = 0; i < D; i++) {
            linked.add(50000, "Da");
        }
        return System.nanoTime() - dadada;
    }

    public long ArrLinkEnd() {
        array = new ArrayList<>();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        linked = new LinkedList<>();
        for (int i = 0; i < D; i++) {
            linked.add("Da");
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < D; i++) {
            array.add("Da");
        }
        return System.nanoTime() - startTime;
    }

}