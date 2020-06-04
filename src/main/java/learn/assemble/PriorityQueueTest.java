package learn.assemble;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        //当使用有容量限制的队列时，此方法通常比add(Object e)方法更好。
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
