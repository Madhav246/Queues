// Queue using Arrays :
public class Queue1 {
    int[] arr;
    int front;
    int rear;
    int size;

    public Queue1() {
        size = 10001;
        this.arr = new int[size];
        front = 0;
        rear = 0;
    }

    //------------------------------------------------------------------------------------------------------------------
    boolean isEmpty() {
        // Implement the isEmpty() function
        if (front == rear) {
            return true;
        }
        return false;
    }

    //------------------------------------------------------------------------------------------------------------------
    void enqueue(int data) {
        // Implement the enqueue() function
        if (rear == size) {
            System.out.println("Queue is full");
        } else {
            arr[rear] = data;
            rear++;
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    int dequeue() {
        if (front == rear) {
            return -1;
        }
        int ans = arr[front];
        arr[front] = -1;
        front++;
        if (front == rear) {
            front = 0;
            rear = 0;
        }
        return ans;
    }

    //------------------------------------------------------------------------------------------------------------------
    int front() {
        if (front == rear) {
            return -1;
        } else {
            return arr[front];
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

    }
}
