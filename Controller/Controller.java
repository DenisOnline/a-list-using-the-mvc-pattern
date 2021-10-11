package Controller;

import View.MyFrame;
import View.MyPanel;
import mylist.MyList;
import mylist.MyQueue;
import mylist.MyStack;

public class Controller {
   MyFrame frame;
   MyPanel panel;
   MyList<Integer> list;
   
   public Controller() {
       panel = new MyPanel();
       panel.setController(this);
       frame = new MyFrame(panel);
   }
   
   public void pushList(int i) {
       if (list == null) {
           list = new MyStack();
           list.push(i);
       } else {
           list.push(i);
       }
   }
   
   public String listToString() {
       return list.toString();
   }
   
   public void setStack() {
       list = new MyStack();
   }
   
   public void setQueue() {
       list = new MyQueue();
   }
}