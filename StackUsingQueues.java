import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    int size;

    //------------------------------------------------------------------------------------------------------------------
    public void push(int x) {
        q1.add(x);

        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.remove());
        }
    }

    //------------------------------------------------------------------------------------------------------------------
    public int pop() {
        return q1.remove();
    }

    //------------------------------------------------------------------------------------------------------------------
    public int top() {
        return q1.peek();
    }

    //------------------------------------------------------------------------------------------------------------------
    public boolean empty() {
        return q1.isEmpty();
    }
}
