package qstackbitmap;

import org.junit.*;

public class NodeTest {

    @Test
    public void randomColor() {
        for(int i = 0; i < 100;i++){
            Node.randomColor();
        }
    }
}