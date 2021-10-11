package mylist;

public class MyQueue<T> extends MyList<T> {
    @Override
    public void push(T t) {
        pushQ(t);
    }
}