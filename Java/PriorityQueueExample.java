package Practice_coding;

import java.util.*;

public class PriorityQueueExample{

    public static void main(String[] args) {
        System.out.println("This is the order which I programmed in my first comparator.");
        PriorityQueue<Integer> queue =
          new PriorityQueue<Integer>(
            new IntegerComparator());
        queue.addAll(Arrays.asList(60, 10, 50, 30, 40, 20));
        //Collections.reverse(queue);
        while (!queue.isEmpty())
          System.out.print(queue.poll() + " ");
        System.out.print("\n");
        System.out.println("This is the order which I programmed in my second comparator.");
        PriorityQueue<Integer> queue2 =
            new PriorityQueue<Integer>(new ReverseIntegerComparator());
        queue2.addAll(Arrays.asList(60, 10, 50, 30, 40, 20));
        while (!queue2.isEmpty())
            System.out.print(queue2.poll() + " ");
        System.out.print("\n");
        System.out.println("This is the natural comparator that is being used in this case.");
        PriorityQueue<Integer> queue3 =
            new PriorityQueue<Integer>(
              Arrays.asList(60, 10, 50, 30, 40, 20));
          //Collections.reverse(queue);
          while (!queue3.isEmpty())
            System.out.print(queue3.poll() + " ");
    
}
}
class IntegerComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2){
            return 1;
        }
        else if (o2 > o1 ){
            return -1;
        }
        return 0;
    }

}
class ReverseIntegerComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return 1;
        }
        else if (o2 < o1 ){
            return -1;
        }
        return 0;
    }

}

