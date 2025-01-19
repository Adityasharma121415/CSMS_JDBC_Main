package com.cars24.runner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit=true;
        System.out.println("Enter choice:");
        System.out.println("1. Add user");
        System.out.println("2. Get user");
        System.out.println("3. Delete user");
        System.out.println("4. Exit");

        while(exit){
            int choice= scanner.nextInt();
            switch(choice){
                case 1: UI.addCustomer();
                break;
                case 2: UI.getCustomer();
                break;
                case 3: UI.deleteCustomer();
                break;
                case 4: exit=false;

            }
        }
    }
}