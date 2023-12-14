import java.util.Stack;

public class StackPop {
    public static void main(String[] args) {
        // Declare a stack
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements into the stack
        stack.push(23);
        stack.push(33);
        stack.push(43);
        stack.push(53);
        stack.push(33);
        stack.push(63);
        stack.push(73);
        stack.push(83);
        stack.push(93);
        stack.push(13);

        // Display elements before removal
        System.out.println("-- Elements --");
        System.out.println(stack);

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        // Display elements after removal
        System.out.println("\nAfter removal");
        System.out.println(stack);
    }
}
