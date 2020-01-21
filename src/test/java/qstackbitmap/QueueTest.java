package qstackbitmap;

import org.junit.*;

public class QueueTest {

    @Test
    public void enqueue() {
        Queue cutie = new Queue();
        cutie.enqueue();
        cutie.enqueue();
        cutie.draw();
    }
    @Test
    public void dequeue(){
        Queue cutie = new Queue();
        cutie.enqueue();
        Node expected = cutie.head;
        Assert.assertEquals("The result should be the head of queue",expected,cutie.dequeue());
    }
}