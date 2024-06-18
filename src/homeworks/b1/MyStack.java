package homeworks.b1;

public class MyStack {
    private String arr[];
    private int size;
    private int index=0;

    public MyStack(int size) {
        this.size = size;
        arr = new String[size];
    }
    public void push(String element){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public String pop() throws Exception {
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[--index];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(index == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(index==size){
            return true;
        }
        return false;
    }
}
