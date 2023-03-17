package Queue;

import java.util.Queue;

import Stack.Stack;

import java.util.LinkedList;

public class CollectionMain {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
        
    }
    public static void reverse(Queue<Integer> q){
        Stack stack = new Stack();
        int k = q.size();
        for(int i=0;i<k;i++) stack.push(q.remove());
        for(int i=0;i<k;i++) q.add(stack.pop());
    }
}
