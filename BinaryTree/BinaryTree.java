package BinaryTree;

import javax.lang.model.util.ElementScanner14;

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

}
