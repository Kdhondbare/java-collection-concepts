import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDequeJavaExample {

    public static void main(String[] args) throws InterruptedException {

        Deque<Integer> integerDeque = new LinkedList<>();

        integerDeque.addFirst(10);
        print(integerDeque);
        integerDeque.addFirst(20);
        print(integerDeque);
        integerDeque.addFirst(30);
        print(integerDeque);

        integerDeque.addLast(40);
        print(integerDeque);
        integerDeque.addLast(50);
        print(integerDeque);

        integerDeque.removeFirst();
        print(integerDeque);
        integerDeque.removeFirst();
        print(integerDeque);

        integerDeque.removeLast();
        print(integerDeque);
        integerDeque.removeLast();
        print(integerDeque);
    }

    static void print(Deque<Integer> integerDeque) throws InterruptedException {
        System.out.println(integerDeque);
        Thread.sleep(2000);
    }
}
