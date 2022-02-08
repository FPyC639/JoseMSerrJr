package Generics;
import HW1.Cat;
import HW1.Color;

import java.util.*;

public class GenericStack<E> {
    private ArrayList<E> stack  = new ArrayList<>();

    public GenericStack(){
        super();
    }

    public int getSize(){
        return this.stack.size();
    }

    public E peek(){
        return stack.get(stack.size()-1);
    }

    public void push(E o) {
        stack.add(o);
      }
    
      public E pop() {
        E o = stack.get(getSize() - 1);
        stack.remove(getSize() - 1);
        return o;
      }
    
      public boolean isEmpty() {
        return stack.isEmpty();
      }
      
      @Override
      public String toString() {
        return "stack: " + this.stack.toString();
      }

      public ArrayList<E> stack_overflow(){
          return stack;
      }

      public  void forEach(java.util.function.Consumer<? super E> arg0) {
      }
    public static void main(String[] args){
        GenericStack<Cat> a1 = new GenericStack<>();
        a1.push(new Cat("Kitty", 2, Color.BLACK, "feral"));
        a1.push(new Cat("Miah",1,Color.BLUE,"domestic"));
        a1.stack_overflow().forEach(i -> System.out.println(i.toString()));
        a1.pop();
        //System.out.println(a1.toString());
        a1.stack_overflow().forEach(i -> System.out.println(i.toString()));
        GenericStack<Integer> a2 = new GenericStack<>();
        for (int i = 0; i < 11; i++){
          a2.push(i);
        }
        a2.stack_overflow().forEach(i -> System.out.println(i*2));
        a2.stack_overflow().forEach(i -> System.out.println(i*3));
        System.out.println(a2.peek());
        a2.pop();
        a2.stack_overflow().forEach(i -> System.out.println(i*2));
        a2.stack_overflow().forEach(i -> System.out.println(i*3));
    }

}