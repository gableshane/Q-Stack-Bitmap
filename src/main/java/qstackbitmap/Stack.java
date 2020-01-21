package qstackbitmap;


import java.awt.*;

public class Stack extends LinkedList{

    public Stack(){
        this.stack = true;
    }

    public Node pop(){
        Node result = this.head;
        if(head.next != null){
            this.head = this.head.next;
            return result;
        } else {
            this.head = null;
            return result;
        }
    }
    public void push(){
        Node n =  new Node();
        n.next = this.head;
        this.head = n;
    }
    public void push(Color color){
        Node n =  new Node(color);
        n.next = this.head;
        this.head = n;
    }
}
