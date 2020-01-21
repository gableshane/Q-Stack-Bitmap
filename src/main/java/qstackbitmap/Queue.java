package qstackbitmap;


import java.awt.*;

public class Queue extends LinkedList{

    Node tail;

    public Queue(){
        this.stack = false;
    }

    public void enqueue(){
        if(this.tail == null){
            Node newNode = new Node();
            this.tail = newNode;
            this.head = newNode;
        } else {
            Node newNode = new Node();
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
    public void enqueue(Color color){
        if(this.tail == null){
            Node newNode = new Node(color);
            this.tail = newNode;
            this.head = newNode;
        } else {
            Node newNode = new Node(color);
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
    public Node dequeue(){
        Node result = this.head;
        this.head = result.next;
        return result;
    }

}
