public class CircularQueue {
    // Initialize your data structure.
    int[] arr;
    int front;
    int rear;
    int size;

    public CircularQueue(int n) {
        this.size = n;
        this.arr = new int[size];
        front = -1;
        rear = -1;
    }


    //------------------------------------------------------------------------------------------------------------------
    public boolean enqueue(int value) {
        // Check if Queue is full :
        if ((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) {
            return false;
        } else if (front == -1) {      //First element to Push
            front = rear = 0;
        } else if (rear == size - 1 && front != -1) {        //To maintain cyclic nature
            rear = 0;
        } else {                //Normal flow
            rear++;
        }
        arr[rear] = value;
        return true;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int dequeue() {
        if (front == -1) {            //To check if Queue is Empty
            return -1;
        }
        int ans = arr[front];
        arr[front] = -1;

        if (front == rear) {          //Single Element is present
            front = rear = -1;
        } else if (front == size - 1) {                  //To maintain cyclic nature
            front = 0;
        } else {                       //Normal Flow
            front++;
        }
        return ans;
    }

    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

    }
}