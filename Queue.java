//Queue using LinkedList :
import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int length() {
        return length;
    }

    //------------------------------------------------------------------------------------------------------------------
    public boolean isEmpty() {
        return length == 0;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void print() {
        if (isEmpty()) {
            return;
        }
        ListNode current = front;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");

    }

    //------------------------------------------------------------------------------------------------------------------
    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int temp = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        length--;
        return temp;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.print();
        System.out.println();

        queue.dequeue();
        queue.print();
        System.out.println();
 
    }
}
