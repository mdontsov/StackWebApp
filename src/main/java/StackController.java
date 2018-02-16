import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Stack;

@SpringBootApplication
public class StackController {

    static Stack<Integer> stack = new Stack<Integer>();
    static Random random = new Random();

    static void doPush() {
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(100);
            stack.push(j);
        }
        System.out.println(stack);
    }

    static void doPop() {
        int value = stack.pop();
        System.out.println(value);
    }

    static void doReset() {
        stack.clear();
        if (stack.isEmpty()) {
            System.out.println("Stack is cleared");
        }
        System.out.println(stack);
    }

    static void doView() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack);
        }
    }

    public static void main(String[] args) {
        doPush();
        doPop();
        doView();
        doReset();
    }
}
