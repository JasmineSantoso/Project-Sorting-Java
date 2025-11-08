import java.util.Random;

public class kelompokJEA {
    public static void bubbleSort(DoubleLL list){
        boolean swapped = false;
        do {
            Node temp = list.head;
            Node next = list.head.next;
            swapped = false;
            while (next != null) {
                if (temp.data > next.data) {
                    int data1 = temp.data;
                    temp.data = next.data;
                    next.data = data1;
                    swapped = true;
                }
                temp = temp.next;
                next = temp.next;
            }
        } while (swapped != false);
    }

    public static void selectionSort(Node head){
        for (Node i = head; i != null; i = i.next) {
            Node min = i;
            for (Node j = i.next; j != null; j = j.next) {
                if (j.data < min.data) {
                    min = j;
                }
            }
            int temp = i.data;
            i.data = min.data;
            min.data = temp;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        DoubleLL list1 = new DoubleLL();
        DoubleLL list2 = new DoubleLL();
        //KelompokJEA sort = new KelompokJEA();

        for (int i = 0; i < 100; i++) {
            list1.addTail(rand.nextInt(100));
        }
        System.out.println("UNSORTED");
        list1.printList();

        System.out.println(" SELECTION SORTED");
        
        long start = System.nanoTime();
        selectionSort(list1.head);
        long end = System.nanoTime();
        list1.printList();
        System.out.printf("Waktu eksekusi     : %.8f detik\n", (end - start) / 1e9);

        for (int i = 0; i < 100; i++) {
            list2.addTail(rand.nextInt(100));
        }
        System.out.println("UNSORTED");
        list2.printList();

        System.out.println(" BUBBLE SORTED");
        start = System.nanoTime();
        bubbleSort(list2);
        end = System.nanoTime();
        list2.printList(); 
        System.out.printf("Waktu eksekusi     : %.8f detik\n", (end - start) / 1e9);       
    }
}