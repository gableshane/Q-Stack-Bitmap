package qstackbitmap;


import java.io.*;

public class LinkedList {

    Node head;
    Board board;
    boolean stack;
    String boardSource = "src/main/resources/board.bmp";
    String save = "src/main/resources/save.bmp";
    String destination = "src/main/resources/result.bmp";

    public LinkedList(){
        this.board = this.getBoard();
    }

    public int getLength(){
        Node n = this.head;
        int length = 1;
        while(n.next != null){
            length++;
            n = n.next;
        }
        return length;
    }
    public Board getBoard() {
        try {
            return new Board(boardSource);
        } catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public void draw(){
        this.board.drawBoard(this);
        this.board.writeBmp(destination);
        this.board.writeBmp(save);
    }
    public Node peek(){
        return this.head;
    }
}
