
package dataStructures;

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
                int size;
                switch (option) {
                    case 1:
                        System.out.println("Linked-list");
                        break;
                    case 2:
                        System.out.println("Ordered Linked List");
                        break;
                    case 3:
                        System.out.println("Please enter Queue size :");
                        int queueSize = input.nextInt();
                        new Que(queueSize).operation();
                    case 4:
                        System.out.println("Please enter stack size :");
                        int stackSize = input.nextInt();
                        new Stack(stackSize).operations();
                }
            } else {
                System.out.println("\nPlease choose 1-4 only");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}