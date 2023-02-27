package stacks_and_queues;

public class Queues {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        for(int i = 0;i < q.size; i++){
            System.out.println("Front: " + q.front+ " Rear: " + q.rear);
            q.enqueue(i);
        }

        for(int i = 0; i < q.size; i++){
            System.out.println("Front: " + q.front+ " Rear: " + q.rear);
            System.out.println("Dequeued value: " + q.dequeue());
        }

    }
}

class Queue {
    public int size, front = -1, rear = -1;
    int [] queue;

    public Queue(int size){
        this.size = size;
        this.queue = new int[size];
    }

    boolean isEmpty(){
        return front == -1 && rear == -1;
    }

    boolean isFull(){
        return rear == size - 1;
    }

    int enqueue(int x){
        if(isFull()) {
            System.out.println("stacks_and_queues.Queue is full");
            return 0;
        }

        if(isEmpty()){
            front = rear = 0;
            queue[rear] = x;
            return x;
        }

        rear++;
        queue[rear] = x;

        return x;
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("The stacks_and_queues.Queue is empty");
            return 0;
        }

        return queue[front++];
    }
}
