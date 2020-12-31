public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
    public void remove() {
        if(head == null) {
            System.out.println("Nothing to remove");
        }
        if(head.next == null) {
            head = null;
        } else {
            Node runner = head;
            while(runner.next.next!= null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    public void printValues() {
        if(head == null) {
            System.out.println("this list is empty!");
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
                System.out.println(runner.value);
            }
    }
    }
}

        
