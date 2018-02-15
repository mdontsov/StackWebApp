import java.util.Stack;

public class StackDemo {

    static Stack<Integer> stack = new Stack<Integer>();

    static void doPush(int... values) {
        for (int i : values) {
            stack.push(i);
        }
    }

    static void doPop() {
        int value = stack.pop();
        System.out.println(value);
    }

    static void doReset() {
        stack.clear();
        if (stack.isEmpty()) {
            System.out.print("Stack is cleared");
        }
    }

    static void doView() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack);
        }
    }

    public static void main(String[] args) {
        doPush(5, 9, 11);
        doPop();
        doView();
        doReset();
    }
}
