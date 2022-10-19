import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int front;
    int length;

    public QueueUsingStacks() {
        front = 0;
        length = 0;
    }

    //------------------------------------------------------------------------------------------------------------------
    public void push(int x) {
        if (s1.empty()) {
            front = x;
        }
        s1.push(x);
        length++;
    }

    //------------------------------------------------------------------------------------------------------------------
    public int pop() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        length--;
        return s2.pop();
    }

    //------------------------------------------------------------------------------------------------------------------
    public int peek() {
        if (!s2.empty()) {
            return s2.peek();
        }
        return front;
    }
    //------------------------------------------------------------------------------------------------------------------
    public boolean empty() {
        return length == 0;
    }
}
