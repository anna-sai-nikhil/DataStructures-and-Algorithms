package BinaryTree;

public class Main {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        int[] a = {7,4,9,1,6,8,10,-8,-7};
        for(int i:a) tree.insert(i);
        for(int i:a) tree2.insert(i);
        System.out.println(tree.equals(tree2));

    }
}
