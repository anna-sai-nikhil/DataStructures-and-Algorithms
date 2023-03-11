package Stack.MinStack;

public class Main {
    public static void main(String[] args){
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(40);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.minCount());
    }
}
