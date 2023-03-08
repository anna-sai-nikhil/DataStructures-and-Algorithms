package LinkedList;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count = 0;

    public void addLast(int item) {
        var node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public int indexOf(int item) {
        int temp_count = 0;
        Node dummy = head;
        while (dummy != null) {
            if (dummy.value == item)
                return temp_count;
            dummy = dummy.next;
            temp_count++;
        }
        return -1;
    }

    public boolean contains(int item) {
        if (indexOf(item) >= 0)
            return true;
        return false;
    }

    public boolean isEmpty() {
        return (count == 0) ? true : false;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List chusko firstu, kali ga undi");
        } else if (count == 1)
            head = tail = null;
        else {
            head = head.next;
            count--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new IllegalArgumentException("List chusko firstu, kali ga undi");
        } else if (count == 1)
            head = tail = null;
        else {
            Node dummy = head;
            for (int i = 1; i < count; i++) {
                if (i == count - 1) {
                    tail = dummy;
                    tail.next = null;
                }
                dummy = dummy.next;
            }
        }
        count--;

    }

    /*public void reverse() {
        Node nikhil = head.next;
        Node sunil = head;
        Node roop = head.next;
        while (nikhil.next != null) {
            roop = nikhil.next;
            nikhil.next = sunil;
            nikhil =roop =roop.next;
            sunil =roop;
            
            
        }
        tail=head;tail.next=null;
        head=nikhil;

    }*/
    public int kthNodeFromEnd(int k){
        Node dummy = head;
        Node p = head;
        while(dummy.next!=null){
            if(k-1<0) p=p.next;
            dummy=dummy.next;
            k--;

        }
        return p.value;
    }

}
