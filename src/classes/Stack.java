package classes;

/**
 * This class defines an integer stack that can hold 10 values.
 */
public class Stack {

    int stk[] = new int[10];
    int tos;

    // initialize top-of-stack
    Stack() {
        tos = -1;
    }

    /**
     * Push an item onto the stack
     * @param x - the item to be added on stack
     */
    void push(int x) {
        if(tos == 9) {
            System.out.println("Stack is full.");
        }
        else {
            stk[++tos] = x;
        }
    }

    /**
     * Pop an item from the stack
     * @return - an int number
     */
    int pop() {
        if(tos < 0) {
            System.out.println("stack underflow.");
            return 0;
        }
        return stk[tos--];
    }

}

class TestStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        System.out.println(stack.pop());
    }

}
