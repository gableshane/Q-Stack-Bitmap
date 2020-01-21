package qstackbitmap;

import org.junit.*;

import java.io.*;

public class BoardTest {
    @Test
    public void testList() {
        Stack zack = new Stack();
        zack.push();
        zack.push();
        zack.push();
        zack.push();
        zack.push();
        zack.push();
        zack.push();
        System.out.println(zack.board.height);
        System.out.println(zack.board.width);
        zack.draw();
    }
    @Test
    public void testReadBoard() throws IOException {
        LinkedList output = Board.readBoard();
        System.out.println(output.getLength());
        System.out.println(output);
        output.draw();
    }
}