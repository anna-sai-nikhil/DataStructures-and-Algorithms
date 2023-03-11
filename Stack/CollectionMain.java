package Stack;

import java.util.Stack;

public class CollectionMain {
    public static String stringReverser(String s) {
        Stack stack = new Stack<Character>();
        char[] c = s.toCharArray();
        for(char i : c) {
            stack.push(i);
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++) sb.append(stack.pop());
        s=sb.toString();
        return s;
    }
    public static boolean balancedExpression(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char i : c) {
            if(i=='[' || i== '{' || i=='(' || i=='<') stack.push(i);
        }
        for(char i : c) {
            if(i==']' || i== '}' || i==')' || i=='>'){
                var top = stack.pop();
                if(
                    (i==')' && top!='(') ||
                    (i=='>' && top!='>') ||
                    (i==']' && top!='[') ||
                    (i=='}' && top!='{')
                    ) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(stringReverser("Sai"));
        System.out.println(balancedExpression("(]"));
        Stack stack = new Stack<Character>();
        


    }
}