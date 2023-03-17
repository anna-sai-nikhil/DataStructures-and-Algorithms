package Stack;

public class oneArrayStacks {
    int[] array = new int[10];
    int count1 = 0;
    boolean flag = false;
    int count2 = 0;

    public void push1(int item) {
        if (count1 +count2==array.length)
            throw new RuntimeException("StackOverFlow");
        else {
            array[count1++] = item;
        }

    }

    public void push2(int item) {
        if (count1 +count2==array.length)
            throw new RuntimeException("StackOverFlow");
        else
            count2++;
            array[array.length-count2] = item;
    }
    public int pop1(){
        return array[--count1];
    }
    public int pop2(){
        return array[--count2];
    }
    public boolean isEmpty1(){
        return (count1==0) ? true : false;
    }
    public boolean isEmpty2(){
        return (count2==0) ? true : false;
    }
    private boolean isFull(){
        return count1+count2==array.length;
    }
    public boolean isFull1(){
        return isFull();
    }
    public boolean isFull2(){
        return isFull();
    }

}
