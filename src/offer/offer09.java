package offer;

import java.util.Stack;

/**
 *用两个栈来实现一个队列，完成队列的 Push 和 Pop 操作。
 */
public class offer09 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack2.push(node);
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    public int pop() {

        return stack2.pop();

    }
}
