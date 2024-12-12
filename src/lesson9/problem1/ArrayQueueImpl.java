package lesson9.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(front >= 0)
            return arr[front];
        return -1;
    }

    public void enqueue(int obj){
        if(front == -1) {
            front = 0;
            rear = 0;
            arr[front] = obj;
        }

        if(rear == arr.length-1) {
           resize();
        }

        arr[rear++] = obj;

    }

    public int dequeue() {
        int temp = arr[0];
        if(front == -1)
            System.out.println("EMPTY Queue");
        if(rear == arr.length-1) {
            resize();
        }

        for(int i = 0; i < rear; i++)
            arr[i] = arr[i+1];
        rear--;
        return temp;
    }
    public boolean isEmpty(){
        return front == -1;
    }

    public int size(){
          if(front == -1)
              return 0;

        return rear;
    }

    private void resize(){
        int len = arr.length;
        int newlen = 2*len;
        int[] temp = new int[newlen];
        System.arraycopy(arr,0,temp,0,len);
        arr = temp;
    }

    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.dequeue();
        System.out.println(arrayQueue.isEmpty());
    }

    @Override
    public String toString() {
        String result = "[";
        for(int a:arr) {
            result = result + a + ",";
        }
        result += "]";
        return result;
    }
}
