public class DoubleLL {
    Node head;
    Node tail;
    Node temp;

    public void addHead(int data){
        Node newNode = new Node(data);
        
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addTail(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void swapByData(int data1, int data2){
        Node nodeA = head;
        Node nodeB = head;
        while(nodeA != null && nodeA.data != data1){
            nodeA = nodeA.next;
        }
        while(nodeB.data != data2 && nodeB != null){
            nodeB = nodeB.next;
        }
        int temp = nodeA.data;
        nodeA.data = nodeB.data;
        nodeB.data = temp;
    }  

    public int getSize(){
        if (head == null) return 0;
        int size = 0;
        while (head != null) {
            size++;
        }
        return size;        
    }

    public void printList(){
        temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

