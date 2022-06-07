package dataStructures.LinkedLis;

import java.util.Scanner;

public class LinkedList {
    Node head;

    public void operations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. insert\n2. insertAtStart\n3. insertAt\n4. deleteAt\n5. print\n6. exit");

        try{
            int length = -1;
            int counter = 0;
            while (counter != 6) {
                System.out.println();
                System.out.println("Select any operation : ");
                int option = sc.nextInt();
                if(option >0 && option<7) {
                    switch (option) {
                        case (1) -> {
                            System.out.println("What you want to insert at last : ");
                            int input = sc.nextInt();
                            insert(input);
                            length = length+1;
                            print();
                        }

                        case (2) -> {
                            System.out.println("What you want to insert at start :");
                            int input = sc.nextInt();
                            insertAtStart(input);
                            length = length+1;
                            print();
                        }

                        case (3) -> {
                            System.out.println("Where you want to insert : ");
                            int index = sc.nextInt();
                            if(index > length){
                                System.out.println("Please enter index from 1 - " + length);
                            }else {
                                System.out.println("What you want to insert at " + index + " position : ");
                                int input = sc.nextInt();
                                insertAt(index, input);
                            }
                            length = length+1;
                            print();
                        }

                        case (4) -> {
                            System.out.println("What position you want to delete :");
                            int index = sc.nextInt();
                            if(index > length) {
                                System.out.println("Please enter index from 1 - "+length);
                            }else{
                                deleteAt(index);
                            }
                            length = length-1;
                            print();
                        }

                        case (5) -> print();
                        case (6) -> {
                            System.out.println("Good Bye");
                            counter = 6;
                        }

                    }
                }else{
                    System.out.println("please choose option between 1-6 only!");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public void insert(int data){
        Node node = new Node();

        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();

        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node n = head;
            Node n1 = null;

            for(int i =0 ; i<index-1; i++){
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }

    }


    public void print(){
        Node node = head;

        while(node.next!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data + " ");
    }
}
