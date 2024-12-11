package lesson9.problem2;

public class LinkedListStack {
    private Node header;
    private int top = -1;

    public void push(Object item) {

    }

//    public Object peek() {
//
//    }
//
//    public Object pop() {
//
//    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int size() {
        return top + 1;
    }

    class Node {
        Object data;
        Node next;
        Node previous;

        public String toString() {
            return data == null ? "null" : this.data.toString();
        }
    }

    public static void main(String[] args) {

    }
}
