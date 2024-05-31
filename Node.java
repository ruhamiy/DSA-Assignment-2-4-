package SearchNode;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }


    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public String searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return "value found : "+ current.data;
            }
            current = current.next;
        }
        return "value not found";
    }
// to check the implementation above
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(15);
        list.addNode(30);
        list.addNode(45);
        list.addNode(60);


        System.out.println(list.searchNode(30));
        System.out.println(list.searchNode(100));
    }
}
