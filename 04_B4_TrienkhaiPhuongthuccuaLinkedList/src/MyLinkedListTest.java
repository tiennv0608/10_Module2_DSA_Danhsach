import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> test = new MyLinkedList<>();
        test.addFirst("Hà Nội");
        test.addFirst("Hải Phòng");
        test.addFirst("Hồ Chí Minh");
        test.add(1,"Đà Nẵng");
        test.add(0,"Huế");
        test.addLast("Vũng Tàu");
        test.addLast("Cà Mau");
        test.printList();
        System.out.println("Xóa");
        test.remove(0);
        test.printList();
    }
}
