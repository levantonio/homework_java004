package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернёет «перевёрнутый» список.
public class Task1 {
    public static void REverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Start collection: " + list);;

        ArrayList<Integer> result = new ArrayList<>(list);
        Collections.reverse(result);

        list.clear();

        for (Integer i : result) {
            list.add(i);
        }
        System.out.println("Reverse collection: " + list);
    }
}
