import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class EffectiveIterator {
    ArrayList<Integer> list = new ArrayList<>();

    //init list with 1000 elements
    public  EffectiveIterator() {
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
    }

    // method browse using For
    public void browseFor(int times) {
        int temp = 0;
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < list.size(); j++) {
                temp = list.get(j);
            }
        }
    }

    // method browse using ForEach
    public void browseForEach(int times) {
        int temp = 0;
        for (int i = 0; i < times; i++) {
            for (Integer integer : list) {
                temp = integer;
            }
        }
    }

    // method browse using Iterator
    public void browseIterator(int times) {
        int temp = 0;
        Iterator<Integer> integers = list.iterator();
        for (int i = 0; i < times; i++) {
            while (integers.hasNext()) {
                temp = integers.next();
            }
        }
    }

    // method browse using ListIterator
    public void browseListIterator(int times) {
        int temp = 0;
        ListIterator<Integer> listIterator = list.listIterator();
        for (int i = 0; i < times; i++) {
            while (listIterator.hasNext()) {
                temp = listIterator.next();
            }
        }
    }

    public static void main(String[] args) {
        EffectiveIterator checkEffectiveIterator = new EffectiveIterator();
        int times = 100000000;
        long start = System.currentTimeMillis();
        checkEffectiveIterator.browseFor(times);
        long end = System.currentTimeMillis();
        System.out.println("Time For: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseForEach(times);
        end = System.currentTimeMillis();
        System.out.println("Time ForEach: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseIterator(times);
        end = System.currentTimeMillis();
        System.out.println("Time Iterator: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        checkEffectiveIterator.browseListIterator(times);
        end = System.currentTimeMillis();
        System.out.println("Time ListIterator: " + (end - start) + " ms");
    }
}
