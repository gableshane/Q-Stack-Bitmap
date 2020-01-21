package qstackbitmap;

import org.junit.*;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void pop() {
        Stack zack = new Stack();
        zack.push();
        Node expected = zack.head;
        assertEquals("Return of pop should be head of list",expected,zack.pop());
    }

    @Test
    public void push() {
        Stack zack = new Stack();
        zack.push();
        zack.push();
        assertEquals("The length of the list should be 2.",2,zack.getLength());
    }

    @Test
    public void peek() {
        Stack zack = new Stack();
        Node expected = null;
        assertEquals("The head of the list should be null",expected,zack.peek());
    }
}