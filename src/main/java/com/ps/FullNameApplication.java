package com.ps;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name:");
        String firstName = scanner.nextLine().trim();
        System.out.println("What is your middle name:");
        String middleName = scanner.nextLine().trim();
        System.out.println("What is your last name:");
        String lastName = scanner.nextLine().trim();
        System.out.println("What is your suffix:");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName + " " + middleName + " " + lastName + " " + suffix;

        System.out.print(fullName.trim());


    }
}
