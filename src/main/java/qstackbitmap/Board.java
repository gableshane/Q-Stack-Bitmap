package qstackbitmap;

import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class Board {

    BufferedImage imageData;
    int height;
    int width;

    public Board(String inputPath) throws IOException {

        File file = new File(inputPath);

        this.imageData = ImageIO.read(file);

        this.height = imageData.getHeight();

        this.width = imageData.getWidth();
    }

    public void drawBoard(LinkedList list) {
        Node n = list.head;
        int black = new Color(0, 0, 0).getRGB();
        int yAxisStart = 0;
        int yAxisEnd = 6;
        while (n != null) {
            for (int x = 0; x < this.width; x++) {
                for (int y = yAxisStart; y < yAxisEnd; y++) {
                    this.imageData.setRGB(x, y, n.color);
                }
            }
            n = n.next;
            yAxisStart += 5;
            yAxisEnd += 5;
        }
        if (!list.stack) {
            this.imageData.setRGB(99, 99, black);
        }
    }

    public static LinkedList readBoard() throws IOException {
        Board board = new Board("src/main/resources/save.bmp");
        Color black = new Color(0, 0, 0);
        Color white = new Color(255, 255, 255);
        Color stackOrQueue = new Color(board.imageData.getRGB(99, 99));
        LinkedList result = new LinkedList();
        int[] checks = new int[]{1,6,11,16,21,26,31,36,41,46,51,56,61,66,71,76,81,86,91,96};
        int[] checksReverse = new int[]{96,91,86,81,76,71,66,61,56,51,46,41,36,31,26,21,16,11,6,0};
        if (stackOrQueue.equals(black)) {
            Queue cutie = new Queue();
            for (int y : checks) {
                Color color = new Color(board.imageData.getRGB(20,y));
                if (!color.equals(white)) {
                    cutie.enqueue(color);
                }
                result = cutie;
            }
        } else {
            Stack zack = new Stack();
            for(int y : checksReverse ) {
                Color color = new Color(board.imageData.getRGB(20, y));
                if (!color.equals(white)) {
                    zack.push(color);
                }
                result = zack;
            }
        }
        return result;
    }
    public void clear() {
        for(int y = 0; y < this.height; y++) {
            for(int x = 0; x < this.width; x++) {
                int white = new Color(255,255,255).getRGB();
                this.imageData.setRGB(x,y,white);
            }
        }
    }
        public void writeBmp (String path){
            try {
                ImageIO.write(this.imageData, "bmp", new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
