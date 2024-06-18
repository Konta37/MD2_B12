package homeworks.b1;

public class StackClient {
    public static void main(String[] args) throws Exception {
        String str = "Chào mừng tới thế giới này.";
        String[] strArr = str.split(" ");
        MyStack stack = new MyStack(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            stack.push(strArr[i]);
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(stack.pop() + "|");
        }
    }
}
