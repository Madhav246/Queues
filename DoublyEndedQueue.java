//Sliding window questions uses this concept :

public class DoublyEndedQueue {
    int[] arr;
    int front;
    int rear;
    int size;

    public DoublyEndedQueue(int n) {
        this.size = n;
        this.arr = new int[n];
        front = -1;
        rear = -1;
    }

    //------------------------------------------------------------------------------------------------------------------
    public boolean pushFront(int x) {
        if ((front == 0 && rear == size - 1) || (front != 0 && rear == (front - 1) % (size - 1))) {
            return false;
        } else if (front == -1) {
            front = rear = 0;
        } else if (front == 0 && rear != size - 1) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = x;
        return true;
    }

    //------------------------------------------------------------------------------------------------------------------
    public boolean pushRear(int x) {
        if ((front == 0 && rear == size - 1) || (front != 0 && rear == (front - 1) % (size - 1))) {
            return false;
        } else if (rear == -1) {
            rear = front = 0;
        } else if (rear == size - 1 && front != 0) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = x;
        return true;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int popFront() {
        if (front == -1) {
            return -1;
        }
        int val = arr[front];
        arr[front] = -1;
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return val;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int popRear() {
        if (front == -1) {
            return -1;
        }
        int val = arr[rear];
        arr[rear] = -1;

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        return val;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    //------------------------------------------------------------------------------------------------------------------
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    //------------------------------------------------------------------------------------------------------------------
    public boolean isEmpty() {
        return front == -1;
    }

    //------------------------------------------------------------------------------------------------------------------
    public boolean isFull() {
        if ((front == 0 && rear == size - 1) || (front != 0 && rear == (front - 1) % (size - 1))) {
            return true;
        }
        return false;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

    }
}
