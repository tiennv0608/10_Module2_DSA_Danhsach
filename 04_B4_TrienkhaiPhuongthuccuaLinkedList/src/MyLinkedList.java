import javax.management.StandardEmitterMBean;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                if (i == index) {

                    Node current = temp.next;
                    temp.next = new Node(element);
                    (temp.next).next = current;
                }
            }
            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 1; i < numNodes; i++) {
            temp = temp.next;
            if (temp.next == null) {
                temp.next = new Node(e);
                temp.next.next = null;
            }
        }
        numNodes++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public E remove(int index) {

        E result = null;
        Node temp = head;
        if (index < 0 || index > numNodes) {
            return result;
        } else if (index == 0) {
            result = (E) temp;
            head = temp.next;
            numNodes--;
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (i == index - 1) {
                    result = (E) temp.next;
                    temp.next = temp.next.next;
                    numNodes--;
                    return result;
                }
                temp = temp.next;
            }
        }


        return result;
    }
}

