package stacks_and_queues;

public class Stack {
    int stackSize, top;
    int values[];

    Stack(int size){
        this.stackSize = size;
        values = new int[size];
        top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == stackSize - 1;
    }

    void push(int value){
        if(isFull()) System.out.println("The stack is full");
        else values[++top] = value;

    }

    int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");

            return -1;
        }

        return values[top--];
    }

    int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty, there's nothing to see");
            return -1;
        }

        return values[top];
    }
}

class Stacks{
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        for (int i = 0; i < 5; i++){
            stack.push(i);
            // System.out.println(stack.peek());
        }

        for (int i = 0; i < 5; i++){
            System.out.println(stack.pop());
        }
    }
}
