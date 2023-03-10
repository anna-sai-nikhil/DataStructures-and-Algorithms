package BinaryTree;

public class Main {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        int[] a = {10,5,15,6,1,8,12,18,17};
        for(int i:a) tree.insert(i);
        for(int i:a) System.out.println(tree.contains(i));

    }
}
