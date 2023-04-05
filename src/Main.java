import homeworks.Task1;
import homeworks.Task2;

public class Main {
    public static void main(String[] args) {
//        Task1.REverseLinkedList();
        Task2.MyQue queue = new Task2.MyQue();
        queue.enqueue(1);
        queue.enqueue(32);
        System.out.println("size = " + queue.size());
        System.out.println("empty? - " + queue.isEmpty());
        queue.print();
        int first = queue.first();
        System.out.println("first elem = " + first);
        int dequeued = queue.dequeue();
        System.out.println("first elem an del him - " + dequeued);
        queue.print();
        queue.enqueue(5456);
        queue.print();

    }
}