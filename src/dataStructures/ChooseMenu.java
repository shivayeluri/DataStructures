
package dataStructures;

import dataStructures.LinkedLis.LinkedList;

import java.util.Queue;
import java.util.Scanner;

public class ChooseMenu {
    public ChooseMenu() {
    }

    public void menuOf(int option) {
        StringBuilder sb = new StringBuilder();
        System.out.println();
        System.out.println("Choose one Data structure");
        sb.append("1. Linked List\n2. Ordered Linked List\n3. Queue\n4. Stack");
        System.out.println(sb);
        Scanner input = new Scanner(System.in);

        try {
            if (option > 0 && option < 5) {
                switch (option) {
                    case 1 -> {
                        System.out.println("You have chose Linked list ");
                        new LinkedList().operations();
                    }
                    case 2 -> System.out.println("ordered linked list");
                    case 3 -> {
                        System.out.println("Please enter Queue size :");
                        int queueSize = input.nextInt();
                        new Que(queueSize).operation();
                    }
                    case 4 -> {
                        System.out.println("Please enter stack size :");
                        int stackSize = input.nextInt();
                        new Stack(stackSize).operations();
                    }
                }
            } else {
                System.out.println("\nPlease choose 1-5 only");
            }
        } catch (Exception e) {
            System.out.println("Please enter size in numeric only !");
        }

    }
}
