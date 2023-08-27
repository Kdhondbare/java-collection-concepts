import java.util.LinkedList;
import java.util.Queue;

public class QueueJavaExample {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        integerQueue.add(11);
        integerQueue.add(21);
        integerQueue.add(31);
        integerQueue.remove();

        System.out.println("Front item : " + integerQueue.peek());

    }
}
