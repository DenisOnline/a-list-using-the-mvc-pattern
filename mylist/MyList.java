package mylist;

public class MyList<T> {
    private static class Node<T> {
        private T t;
        private Node<T> next;
        
        public Node(T t) {
            this.t = t;
        }
        
        @Override
        public String toString() {
            return t.toString();
        }
    }
    
    private Node<T> first;
    private Node<T> tail;
    
    public MyList() {
        first = null;
    }

    public void push(T t) { 
        Node<T> newFirst = new Node<>(t);
        if (first == null) {
            first = newFirst;
            tail = newFirst;
        } else {
            newFirst.next = first;
            first = newFirst;
        }
    }

    public void pushQ(T t) {
        Node<T> newLast = new Node<>(t);
        if (first == null) {
          first = newLast;
          tail = newLast;
        }
        else {
            tail.next = newLast;
            tail = newLast;
        }
    }
    
    public T pop() {
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.t;
    }
    
    @Override
    public String toString() {
        String help = "";
        Node<T> currentNode = first;
        while(currentNode != null) {
            help = help + currentNode.t + " ";
            currentNode = currentNode.next;
        }
        return help;
    }
}