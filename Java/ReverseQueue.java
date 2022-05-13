package MidTerm;

import java.util.*;
import java.util.stream.Collectors;

import javax.xml.namespace.QName;

public class ReverseQueue {
    
    public static void main(String[] args){
        final long SEED = 111L;
        final int CONSTANT = 10;
        Random a0 = new Random(SEED);
        Queue<Integer> q = new  LinkedList<Integer>();
        System.out.println("This is what is inside the queue.");
        for(int i= 0; i < CONSTANT; i++) q.add(a0.nextInt(0, CONSTANT*10));
        q.forEach(i -> System.out.println(i));
        System.out.println("This is the top of the queue " + q.peek());
        //Stack<Integer> q_not = new Stack<>();
        //System.out.println("This is what is inside the stack.");
        //while(q.size()!=0) q_not.push(q.poll());
        //System.out.println("Before Push, and Pop");
        //q_not.forEach(i -> System.out.println(i));
        //Collections.reverse(q_not);
        //System.out.println("After Reverse");
        //q_not.forEach(i-> System.out.println(i));
        //System.out.println("This is the top of the stack" + q_not.peek());
        //while(q_not.size() != 0)  q.add(q_not.pop());
        //System.out.println("This is the new top of the queue "+ q.peek());
        //System.out.println("This is now what is inside the queue");
        //q.forEach(i->System.out.println(i));
        //ArrayList<Integer> a1 = new ArrayList<>();
        //while(q.size() != 0) a1.add(q.poll());
        //System.out.println("This is now what is inside of the Array List.");
        //a1.forEach(i -> System.out.println(i));
        //Collections.reverse(a1);
        //q.addAll(a1);
        //System.out.println("This is the new top of the queue "+ q.peek());
        //System.out.println("This is now what is inside the queue");
        //q.forEach(i->System.out.println(i));
        //List<Integer> a2 = new Vector<>();
        //while(q.size() != 0) a2.add(q.poll());
        //System.out.println("This is now what is inside of the Vector.");
        //a2.forEach(i -> System.out.println(i));
        //Collections.reverse(a2);
        //q.addAll(a2);
        //System.out.println("This is the new top of the queue "+ q.peek());
        //System.out.println("This is now what is inside the queue.");
        //q.forEach(i->System.out.println(i));
        Set<Integer> a3 = new LinkedHashSet<>();
        a3.addAll(q);
        System.out.println("This is what is inside the HashSet");
        a3.forEach(i -> System.out.println(i));
        List<Integer> a31 = a3.stream().collect(Collectors.toList());
        Collections.reverse(a31);
        a3.clear();
        a3.addAll(a31);
        System.out.println("This is what is inside the reversed HashSet");
        a3.forEach(i -> System.out.println(i));
        
    }



}
