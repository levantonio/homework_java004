package homeworks;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task2 {


    public static class MyQue {
        public LinkedList<Integer> queue = new LinkedList<>();

        public void enqueue(int item) {
            queue.add(item);
        }

        public int dequeue() {
            int item = queue.getFirst();
            queue.removeFirst();
            return item;
        }

        public int first() {
            return queue.getFirst();
        }

        public int size() {
            return queue.size();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public void print() {
            System.out.println(queue.toString());
        }


    }

}
