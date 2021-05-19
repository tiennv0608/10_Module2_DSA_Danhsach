public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Bóng");
        list.add("đá");
        list.add("là");
        list.add("số");
        list.add("Một");
        System.out.println(list.get(4));
        print(list.getElements());
        System.out.println(list.indexOf("số"));
        System.out.println(list.indexOf("là"));
        list.remove(1);
        list.add("rổ",1);
        print(list.getElements());
        System.out.println("Sau khi xóa");
        list.clear();
        print(list.getElements());
        System.out.println("kết thúc");


    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }

}
