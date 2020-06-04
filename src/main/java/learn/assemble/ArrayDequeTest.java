package learn.assemble;

import java.util.ArrayDeque;

public class ArrayDequeTest {
    public static void main(String[] args) {
        ArrayDeque stack=new ArrayDeque();
        stack.push("疯狂JAVA讲义");
        stack.push("轻量级");
        stack.push("疯狂Android");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        ArrayDeque queue=new ArrayDeque();
        queue.push("疯狂JAVA讲义");
        queue.push("轻量级");
        queue.push("疯狂Android");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
