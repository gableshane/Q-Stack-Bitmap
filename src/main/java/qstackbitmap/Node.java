package qstackbitmap;


import java.awt.*;
import java.util.*;

public class Node {
    int color;
    Node next;

    public Node(){
        int[] color = randomColor();
        this.color = new Color(color[0],color[1],color[2]).getRGB();
    }
    public Node(Color color){
        this.color = color.getRGB();
    }
    public static int[] randomColor(){
        int[] result = new int[3];
        Random r = new Random();
        for(int i = 0; i < result.length;i++){
            result[i] = r.nextInt((256));
        }
        if(result[0] == 255){
            result[0] = 254;
        } else if(result[0] == 0){
            result[0] = 1;
        }
        return result;
    }
}
