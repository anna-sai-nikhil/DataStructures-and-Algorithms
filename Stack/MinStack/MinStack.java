package Stack.MinStack;

public class MinStack {
    int[] array = new int[5];
    int count = 0;
    int minCount = 0;

    public void push(int item) {
        array[count++] = item;
        if(count==0) minCount=count;
        else{
            minCount = (array[minCount]<item) ? minCount : count-1;
        }


    }

    public void peek() {
        if (count == 0)
            throw new RuntimeException("Deklo bai");
        System.out.println(array[count - 1]);
    }

    public int pop() {
        if (count == 0)
            throw new RuntimeException("Deklo bai");
        return array[--count];
    }
    public int minCount(){
        return array[minCount];
    }

}
