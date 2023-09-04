/**
 * Resizable-array implementation of the Deque interface.
 * Array deque have no capacity restriction;
 * they grow as necessary to support usage.
 * They are not thread-safe;
 * in the absence of external synchronization,
 * they do not support concurrent access by multiple threads.
 * Null elements are prohibited.
 * This class is likely to be faster than stack when used as a stack,
 * and faster than LinkedList when used as a queue.
 */

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Queue
 * Deque imp Queue
 * ArrayDeque & LinkedList both imp Deque
 */
public class ArrayDequeAsDequeJavaExample {
    public static void main(String[] args) throws InterruptedException {
        //Deque
        //addFront - dec front
        //addLast - inc rear
        //removeFirst - inc front
        //removeLast - dec rear

        Deque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.addFirst(10);
        print(integerArrayDeque);
        integerArrayDeque.addFirst(20);
        print(integerArrayDeque);
        integerArrayDeque.addLast(30);
        print(integerArrayDeque);
        integerArrayDeque.addLast(40);
        print(integerArrayDeque);

        integerArrayDeque.removeFirst();
        print(integerArrayDeque);
        integerArrayDeque.removeLast();
        print(integerArrayDeque);

        integerArrayDeque.addFirst(50);
        print(integerArrayDeque);
        integerArrayDeque.addLast(60);
        print(integerArrayDeque);
    }

    static void print(Deque<Integer> integerArrayDeque) throws InterruptedException{
        System.out.println(integerArrayDeque);
        Thread.sleep(2000);
    }
}
