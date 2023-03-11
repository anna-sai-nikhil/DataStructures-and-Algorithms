package Stack;

public class newMain {
    public static void main(String[] args){
        oneArrayStacks stacks = new oneArrayStacks();
        for(int i=1;i<=7;i++) stacks.push1(i);
        for(int i=1;i<=3;i++) stacks.push2(i);
        stacks.pop1();
        stacks.push2(5);
    }
}
