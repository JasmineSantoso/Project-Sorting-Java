import java.util.Random;

public class kelompokJEA {
    public static void bubbleSort(DoubleLL list){
        int i = list.getSize();
        boolean swapped = true;
        while ((i > 0) && (swapped)){
            Node j = list.head;
            swapped = false;
            while (j.next != null) {
                if (j.data > j.next.data){
                    list.swapByData(j.data, j.next.data);
                    // int temp = j.data;
                    // j.data = j.next.data;
                    // j.next.data = temp;
                    swapped = true;
                }
                j = j.next;
            }
            i--;
        }        
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

        for (int i = 0; i < 5; i++) {
            list1.addTail(rand.nextInt(100));
        }
        list1.printList();

        selectionSort(list1.head);
        list1.printList();

        for (int i = 0; i < 7; i++) {
            list2.addTail(rand.nextInt(100));
        }
        list2.printList();

        bubbleSort(list2);
        list2.printList();        
    }
}
