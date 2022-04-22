import java.util.*;

public class MyStack<T extends Comparable<T>> {
    private ArrayList<T> arr;

    public MyStack() {
        arr= new ArrayList<>();
    }
    public void push(Integer N) {
        arr.add((T) N);
    }
    public T pop() {
        if( arr.isEmpty()){
            System.out.println("Stack is empty");
        } return arr.remove(arr.size()-1);//??
    }
    public T peek() {
        if( arr.isEmpty()){
            System.out.println("Stack is empty");
        } return arr.get(arr.size()-1);
    }

    public boolean isEmpty() {
        String b = String.valueOf(arr.size());
        return (b.equals("0"));
    }
    public int size(){
        return arr.size();
    }

    public static void main(String[] args) {
        MyStack kkk= new MyStack();
        kkk.push(22);
        kkk.push(1);
        kkk.push(25);
        kkk.push(72);
        System.out.println("Given Stack Using ArrayList is:"+kkk);
        System.out.println("Stack size is:"+kkk.size());

        System.out.println("Peek operation:"+kkk.peek());
        System.out.println("Stack after peek:"+kkk);

        System.out.println("Pop operation:"+kkk.pop());
        System.out.println("Stack after pop:"+kkk);

        System.out.println("is stack is empty?:"+kkk.isEmpty());
    }

}
