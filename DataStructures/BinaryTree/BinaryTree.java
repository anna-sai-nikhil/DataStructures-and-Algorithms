package BinaryTree;


public class BinaryTree {
    private class Node {
        private int value;

        Node(int value) {
            this.value = value;
        }

        private Node LeftChild;
        private Node RightChild;
    }

    private Node Root;

    public void insert(int item) {
        Node node = new Node(item);
        if (Root == null) {
            Root = node;
        } else {
            Node current = Root;
            while (current.LeftChild != null || current.LeftChild != null) {

                if (current.value < node.value)
                    if (current.RightChild != null)
                        current = current.RightChild;
                    else
                        break;
                else if (current.LeftChild != null)
                    current = current.LeftChild;
                else
                    break;
            }
            if (current.value < node.value) {
                current.RightChild = node;
            } else {
                current.LeftChild = node;
            }
        }
    }

    public boolean contains(int item) {
            Node current = Root;
            while(current!=null){
                if(item<current.value) current=current.LeftChild;
                else if(item>current.value) current=current.RightChild;
                else return true;
            }

        return false;
    }
    public void treversePreOrder(){
        treversePreOrder(Root);
    }
    private void treversePreOrder(Node root){
        if(root == null) return;
        System.out.println(root.value);
        treversePreOrder(root.LeftChild);
        treversePreOrder(root.RightChild);
    }
    public void transversePostOrder(){
        transversePostOrder(Root);
    }
    private void transversePostOrder(Node root){
        if(root==null) return;
        treversePreOrder(root.LeftChild);
        transversePostOrder(root.RightChild);
        System.out.println(root.value);
    }
    public void transverseInOrder(){
        transverseInOrder(Root);
    }
    private void transverseInOrder(Node root){
        if(root==null) return;
        transverseInOrder(root.LeftChild);
        System.out.println(root.value);
        transverseInOrder(root.RightChild);
        
    }
    public int height(){
        return height(Root);
    }
    private int height(Node root){
        if(root==null) return -1;
        if(root.LeftChild==null && root.RightChild==null) return 0;
        int height=1+Math.max(height(root.LeftChild),height(root.RightChild));
        return height;
    }
    public int minValue(){
        return minValue(Root);
    }
    private int minValue(Node root){
        while(root.LeftChild!=null){
            root=root.LeftChild;
        }

        return root.value;
    }
    private int PostOrder(Node root){
        if(root==null) return 0;
        PostOrder(root.LeftChild);
        PostOrder(root.RightChild);
        return root.value;
    }
    private boolean equals(BinaryTree tree){
        var p1 = Root;
        var p2 = tree.Root;
        if(PostOrder(p1) == PostOrder(p2)) return true;
        else return false;
        
        

    }

}
