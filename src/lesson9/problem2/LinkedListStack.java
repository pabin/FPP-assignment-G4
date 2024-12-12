package lesson9.problem2;

public class LinkedListStack {
    private Node header;

    LinkedListStack() {
        this.header = new Node();
    }

    public void push(String item) {
        if (item == null) return;

        Node n = new Node();
        Node current = header;

        while (current != null) {
            if (current.next == null) {
                n.previous = current;
                n.data = item;
                n.next = null;
                current.next = n;
                break;
            }
            current = current.next;
        }
    }

    public String peek() {
        if (this.isEmpty()) return null;

        Node current = header;
        while (current != null) {
            if (current.next == null) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public String pop() {
        if (this.isEmpty()) return null;

        Node current = header;
        while (current != null) {
            if (current.next == null) {
                current.previous.next = null;
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.header.next == null;
    }

    public int size() {
        Node current = this.header;
        int count = -1;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();
    }

    private void toString(StringBuilder sb, LinkedListStack.Node n) {
        if (n == null) return;
        if (n.data != null) sb.append(n.data + " ");
        toString(sb, n.next);
    }

    class Node {
        String data;
        Node next;
        Node previous;

        public String toString() {
            return this.data == null ? "null" : this.data;
        }
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        System.out.println("is empty ?: " + stack.isEmpty());
        System.out.println("current size: " + stack.size());
        stack.push("Spring");
        stack.push("NestJS");
        stack.push("DotNet");
        System.out.println("current stack:");
        System.out.println(stack);
        System.out.println("current size: " + stack.size());

        System.out.println();
        System.out.println("peek:");
        System.out.println(stack.peek());

        System.out.println();
        stack.push("Djagno");
        stack.push("ExpressJS");
        System.out.println("current stack (added two more):");
        System.out.println(stack);
        System.out.println("current size: " + stack.size());
        System.out.println("is empty ?: " + stack.isEmpty());

        System.out.println();
        System.out.println("pop 1: " + stack.pop());
        System.out.println("pop 2: " + stack.pop());

        System.out.println();
        System.out.println("current stack:");
        System.out.println(stack);
        System.out.println("current size: " + stack.size());
        System.out.println("is empty ?: " + stack.isEmpty());
    }
}
