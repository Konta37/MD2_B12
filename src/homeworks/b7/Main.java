package homeworks.b7;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        boolean isTrue = true;
        for (Integer i : list) {
            if(stack.isEmpty() || i < stack.peek()) {
                stack.push(i);
                isTrue = true;
            }else {
                stack.push(i);
                isTrue = false;
            }
        }
        System.out.println(isTrue? "Có" + " giảm dần." : "Không" + " giảm dần.");
    }
}
