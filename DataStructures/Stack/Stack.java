package Stack;

public class Stack {
    int[] array = new int[5];
    int count = 0;

    public void push(int item) {
        if (count < array.length)
            array[count++] = item;
        else {
            int[] arr = new int[array.length * 2];
            for (int i = 0; i < count; i++)
                arr[i] = array[i];
            array = arr;
            array[count++] = item;

        }
    }
    public void peek(){
        if(count==0) throw new RuntimeException("Deklo bai");
        System.out.println(array[count-1]);
    }
    public int pop(){
        //if(count==0) throw new RuntimeException("Deklo bai");
        return array[--count];
        

    }


}
