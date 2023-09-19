package LinkedList;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
   
     //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //remove
    public int removeFirst(int data){
        if(head == null){
            return Integer.MIN_VALUE;
        } 
        if(size == 1){
            head=tail=null;
            size--;
        }
        int val = head.data;
        head=head.next;
        head.prev = null;
        size--;
        return val;
    }
    
    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        DoublyLinkedList dbll = new DoublyLinkedList();
        dbll.addFirst(1);
        dbll.addFirst(5);
        dbll.print();
        System.out.println(dbll.size);
        dbll.removeFirst(1);
        dbll.print();
    }
}
