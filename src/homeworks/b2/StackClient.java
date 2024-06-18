package homeworks.b2;

import homeworks.b2.MyStack;

public class StackClient {
    public static boolean isValid(String s) throws Exception {
        // Tạo một MyStack với kích thước bằng độ dài chuỗi s
        MyStack stack = new MyStack(s.length());
        // Duyệt từng ký tự trong chuỗi
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Nếu ký tự là dấu ngoặc mở, đưa vào stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(String.valueOf(c));
            }
            // Nếu ký tự là dấu ngoặc đóng, kiểm tra stack
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                String top = stack.pop();
                // Kiểm tra xem dấu ngoặc mở và đóng có khớp không
                if ((c == ')' && !top.equals("(")) ||
                        (c == '}' && !top.equals("{")) ||
                        (c == ']' && !top.equals("["))) {
                    return false;
                }
            }
        }
        // Nếu stack không rỗng sau khi duyệt hết chuỗi, chuỗi không đúng
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        try {
            String test1 = "({[]})";
            String test2 = "({[})";
            String test3 = "a{b[c(d)e]f}";
            System.out.println(isValid(test1)); // Output: true
            System.out.println(isValid(test2)); // Output: false
            System.out.println(isValid(test3)); // Output: true
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
