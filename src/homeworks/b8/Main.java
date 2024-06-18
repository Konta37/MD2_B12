package homeworks.b8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //B1: Tạo stack
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check is Number or not");
        String str = sc.nextLine();
        String input1 = "abc235fg";
        String input2 = "142857";
        String input3 = "s12345";
        // Bước 2: Duyệt qua từng ký tự trong chuỗi đầu vào và thêm các số vào stack
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }
        }

        //check stack xem rỗng hay ko
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else {
            //B3: Check từng số xem có phải là số nguyên tố hay ko
            //tạo biến boolean check tất cả các số trong mảng có phải nto
            boolean allNumIsPrime = true;
            while (!stack.isEmpty()) {
                int num = stack.pop();
                //nếu ko phải là số nto thì out while
                if (!isPrime(num)) {
                    allNumIsPrime = false;
                    break;
                }
            }
            //B4: in kqua
            if (allNumIsPrime) {
                System.out.println("Stack has all number are Prime");
            }else {
                System.out.println("Stack has all number are not Prime");
            }
        }


    }

    public static boolean isPrime(int num) {
        if (num < 1) {
            //Số <1 ko phải số nguyen to
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
