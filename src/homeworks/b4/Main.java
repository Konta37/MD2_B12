package homeworks.b4;

import java.util.Stack;

public class Main {
    public static boolean isFullSym(String input){
        String processingString = input.replaceAll("[^()]", "").toLowerCase();
        String[] strArr = processingString.split("");
        Stack<Character> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();
//        for (char ch : processingString.toCharArray()) {
//            if (ch == '(') {
//                stack.push(ch);
//            } else if (ch == ')') {
//                if (stack.isEmpty() || stack.pop() != '(') {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
        for (String str : strArr) {
            if (str.equals("(")) {
                stack2.push(str);
            }else if(str.equals(")")){
                if(stack2.isEmpty() || !stack2.pop().equals("(")){
                    return false;
                }
            }
        }
        return stack2.isEmpty();
    }
    public static void main(String[] args) {
        String input1 = "s * (s – a) * (s – b) * (s – c)";
        String input2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String input3 = "s * (s – a) * (s – b * (s – c)";
        String input4 = "s * (s – a) * s – b) * (s – c)";
        String input5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String input6 = "((())";
        System.out.println(input6.replaceAll("[^()]", "").toLowerCase());
        System.out.println(isFullSym(input1));
        System.out.println(isFullSym(input2));
        System.out.println(isFullSym(input3));
        System.out.println(isFullSym(input4));
        System.out.println(isFullSym(input5));
        System.out.println(isFullSym(input6));

    }
}
