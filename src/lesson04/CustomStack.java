package lesson04;

import java.util.Stack;

public class CustomStack {

    private final int[] array;

    private int count;

    public CustomStack(int size){
        array = new int[size];
        count = 0;
    }

    public int peek(){
        if (count == 0) throw new RuntimeException("Stack is empty");
        return array[count - 1];
    }

    public int pop(){
        if (count == 0) throw new RuntimeException("Stack is empty");
        return array[--count];
    }

    public void push(int element){
        if (count == array.length) throw new RuntimeException("Stack is full");
        array[count++] = element;
    }

    public static <Stack> void main(String[] args) throws InterruptedException {
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());


    }

}
