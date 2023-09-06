import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) -> Integer.compare(y, x));

        pq.add(10);
        pq.add(5);
        System.out.println(pq.peek());
        Papa pa = new Papa();
        pa.show();
    }
   static public class Papa
    {
       static void show(){
            System.out.println("In show");
        }
    }
}
