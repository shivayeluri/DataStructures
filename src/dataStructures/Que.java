package dataStructures;

import java.util.Scanner;

public class Que {
    int SIZE;
    int[] items;
    int front;
    int rear;

    public Que(int size) {
        SIZE = size;
        items = new int[SIZE];
        front = -1;
        rear = -1;
    }

    public void operation() {
        System.out.println(" ");
        System.out.println("Choose one operation");
        System.out.print("1. enqueue\n2. dequeue\n3. print\n4. quit");
        System.out.println(" ");
        boolean counter = false;

        try {
            while (!counter) {
                Scanner sc = new Scanner(System.in);
                System.out.println("select operation");
                int option = sc.nextInt();
                if (option > 0 && option < 5) {
                    switch (option) {
                        case 1 -> {
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("what you want to enqueue");
                            int input = sc1.nextInt();
                            enQueue(input);
                            display();
                        }
                        case 2 -> deQueue();
                        case 3 -> display();
                        case 4 -> {
                            display();
                            counter = true;
                            System.exit(-1);
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println("If you are at operation selection Please choose between 1 - 4 only !");
            System.out.println("If you are entering input values or index values, Please make sure that you have entered Integers only.");
            operation();
        }
    }

    boolean isQueFull() {
        return front == 0 && rear == SIZE - 1;
    }

    boolean isQueEmpty() {
        return front == -1;
    }

    void enQueue(int element) {
        if (isQueFull()) {
            System.out.println("Queue is full");
            System.exit(-1);
        } else {
            if (front == -1) {
                front = 0;
            }

            ++rear;
            items[rear] = element;
            System.out.println("Insert " + element);
        }

    }

    void deQueue() {
        if (isQueEmpty()) {
            System.out.println("Queue is empty");
        } else {
            int element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                ++front;
            }

            System.out.println("" + element + " Deleted");
        }

    }

    void display() {
        if (isQueEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");

            for(int i = front; i <= rear; ++i) {
                int value = items[i];
                System.out.print("" + value + "  ");
            }

            System.out.println("\nRear index-> " + this.rear);
        }

    }
}
