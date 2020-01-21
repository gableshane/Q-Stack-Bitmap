/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package qstackbitmap;

import java.io.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws IOException {

        String crud = args[0].toUpperCase();

        if(crud.equals("CREATE")){
            String type = args[1].toUpperCase();
            if(type.equals("STACK")){
                Stack zack = new Stack();
                zack.draw();
            } else if(type.equals("QUEUE")){
                Queue cutie = new Queue();
                cutie.draw();
            }
        }

        if (crud.equals("READ")){
            LinkedList linky = Board.readBoard();
            linky.draw();
        }


        if (crud.equals("UPDATE")){

            String type = args[1].toUpperCase();


            if(type.equals("STACK")){
                String method = args[2].toUpperCase();
                Stack zack = (Stack) Board.readBoard();
                if(method.equals("POP")){
                    zack.pop();
                } else if (method.equals("PUSH")){
                    zack.push();
                } else if (method.equals("PEEK")){
                    zack.peek();
                }
                zack.draw();
            }

            if(type.equals("QUEUE")){
                String method = args[2].toUpperCase();
                Queue cutie = (Queue) Board.readBoard();
                if(method.equals("ENQUEUE")){
                    cutie.enqueue();
                } else if (method.equals("DEQUEUE")){
                    cutie.dequeue();
                } else if (method.equals("PEEK")){
                    cutie.peek();
                }
                cutie.draw();
            }
        }
        if (crud.equals("DELETE")){
            LinkedList linky = new LinkedList();
            linky.draw();
        }
    }
}