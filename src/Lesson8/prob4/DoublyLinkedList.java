package Lesson8.prob4;

public class DoublyLinkedList {
    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item) {
        if (item == null) return;
        Node n = new Node();
        Node current = header;
        while (current != null) {
            if (current.next == null) {
                n.previous = current;
                n.value = item;
                n.next = null;
                current.next = n;
                if (current.previous == null) {
                    header.next = n;
                }
                break;
            }
            current = current.next;
        }
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        Node current = header.next;

        boolean removed = false;
        while (current != null) {
            if (current.value.equals(item)) {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                removed = true;
                break;
            }
            current = current.next;
        }
        return removed;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        if (header.next != null) {
            header.next = header.next.next;
            header.next.previous = header;
            return true;
        }
        return false;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        Node current = header.next;

        while (current != null) {
            if (current.next != null) {
                current = current.next;
            }
            if (current.next == null) {
                break;
            }
        }

        while (current != null) {
            System.out.println(current.value);
            if (current.previous != null) {
                current = current.previous;
            }
            if (current.previous == null) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(n.value + " ");
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.println("add last...");
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        list.addLast("Vikky");
        System.out.println(list);

        System.out.print("\n");
        System.out.println("remove...");
        boolean removeResult = list.remove("Harry");
        System.out.println("removed Harry: " + removeResult);
        System.out.println(list);

        System.out.print("\n");
        System.out.println("remove first...");
        list.addLast("Edward");
        System.out.println(list);
        System.out.println("removed first: " + list.removeFirst());
        System.out.println("removed first: " + list.removeFirst());
        System.out.println(list);

        System.out.print("\n");
        System.out.println("print reverse...");
        list.addLast("Bill");
        list.addLast("Jennifer");
        System.out.println(list);

        System.out.print("\n");
        list.printReverse();
    }
}
