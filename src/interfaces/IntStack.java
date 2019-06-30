package interfaces;

public interface IntStack {

    void push(int item); // store an item
    int pop(); // retrieve an item
}

/**
 * Class that create a model for fixed stack
 */
class FixedStack implements IntStack {

    private int stk[];
    private int tos;

    // allocate and initialize stack
    FixedStack(int size) {
        stk = new int[size];
        tos = -1;
    }

    /**
     * Push an item into the stack
     * @param item - the item to be added in stack
     */
    @Override
    public void push(int item) {
        if(tos == stk.length - 1){
            System.out.println("Stack is full");
        } else {
            stk[++tos] = item;
        }
    }

    /**
     * Pop an item from the stack
     * @return - an item from the stack
     */
    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            return stk[tos--];
        }
    }
}

/**
 * Test FixedStack class.
 */
class StackTest {

    public static void main(String[] args) {

        FixedStack fixedStack = new FixedStack(2);
        for (int i = 0; i < 2; i++) {
            fixedStack.push(i);
        }

        System.out.println(fixedStack.pop());
        System.out.println(fixedStack.pop());
        
    }

}
