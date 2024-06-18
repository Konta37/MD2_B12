package homeworks.b5;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(35);
        list.add(20);
        list.add(9);
        for (Integer integer : list) {
            if (stack.isEmpty() || integer >= stack.get(stack.size() - 1)) {
                System.out.println("List " + integer);
                stack.push(integer);
            }
        }
        System.out.println("LN: "+stack.get(stack.size() - 1));
    }
}
