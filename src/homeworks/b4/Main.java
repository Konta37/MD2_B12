package homeworks.b4;

import java.util.Stack;

public class Main {
    public static boolean isFullSym(String input){
        String processingString = input.replaceAll("[^()]", "").toLowerCase();
        String[] strArr = processingString.split("");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < strArr.length; i++) {
            stack.push(strArr[i]);
        }
        System.out.println(stack.get(0));
        return true;
    }
    public static void main(String[] args) {
        String input1 = "s * (s – a) * (s – b) * (s – c)";
        String input2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        String input3 = "s * (s – a) * (s – b * (s – c)";
        String input4 = "s * (s – a) * s – b) * (s – c)";
        String input5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(input1.replaceAll(" ", "").toLowerCase());
        Stack<String> hihi = new Stack<>();
        isFullSym(input3);

    }
}
