package StackAndQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q02_NextGreaterElement {

    public static List<Integer> nextGreaterElements(int[] arr) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=arr.length-1; i>=0; i--) {
            // Removing the smaller elements than arr[i]
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // when the stack will be empty then no element will be greater than the arr[i] so we will add '-1'
            if (stack.isEmpty()) res.addFirst(-1);
            // if the stack is not yet empty, means there is an element which is greater than arr[i]
            else res.addFirst(stack.peek());

            // at last, we will push the element to the stack
            stack.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {6,0,8,1,3};
        System.out.println(nextGreaterElements(arr));
    }
}
