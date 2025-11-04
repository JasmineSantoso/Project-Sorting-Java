import java.util.Random;

public class kelompokJEA {
    // public static void bubbleSort(DoubleLL list){
    //     int i = list.getSize();
    //     boolean swapped = true;
    //     while ((i > 0) && (swapped)){
    //         Node j = list.head;
    //         swapped = false;
    //         while (j.next != list.tail) {
    //             if (j.data > j.next.data){
    //                 list.swapByData(j.data, j.next.data);
    //                 swapped = true;
    //             }
    //             j = j.next;
    //         }
    //         i--;
    //     }        
    // }

    public static void bubbleSort(DoubleLL list){
         if (list.head == null) return;

        boolean swapped;
        Node end = null;

        do {
            swapped = false;
            Node current = list.head;

            while (current.next != end) {
                if (current.data > current.next.data) {
                    list.swapByData(current.data, current.next.data);
                    swapped = true;
                }
                current = current.next;
            }
            end = current; // node terakhir sudah diurutkan
        } while (swapped);
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

//  if (list.head == null) return;

//         boolean swapped;
//         Node end = null;

//         do {
//             swapped = false;
//             Node current = list.head;

//             while (current.next != end) {
//                 if (current.data > current.next.data) {
//                     list.swapByData(current, current.next);
//                     swapped = true;
//                 }
//                 current = current.next;
//             }
//             end = current; // node terakhir sudah diurutkan
//         } while (swapped);