public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList linkedList = new MyLinkedList(10);
        System.out.println("After add");
        linkedList.printList();
        linkedList.addFirst(11);
        System.out.println("After add");
        linkedList.printList();
        linkedList.addFirst(12);
        System.out.println("After add");
        linkedList.printList();
        linkedList.addFirst(13);
        System.out.println("After add");
        linkedList.printList();

        linkedList.add(11,45);
        System.out.println("After add");
        linkedList.printList();

        linkedList.add(4,9);
        System.out.println("After add");
        linkedList.printList();
        linkedList.add(4,1);
        System.out.println("After add");
        linkedList.printList();
        linkedList.add(2,20);
        System.out.println("After add");
        linkedList.printList();
        linkedList.add(5,15);
        System.out.println("After add");
        linkedList.printList();
        linkedList.add(7,30);
        System.out.println("After add");
        linkedList.printList();

        linkedList.addFirst(23);
        System.out.println("After add");
        linkedList.printList();
        linkedList.addFirst(25);
        System.out.println("After add");
        linkedList.printList();
        linkedList.addFirst(27);
        System.out.println("After add");
        linkedList.printList();
        System.out.println(linkedList.toString(7));
        System.out.println(linkedList.toString(10));
    }
}
