package com.javacore.lesson2;

import java.util.Scanner;

public class HumanData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("city: ");
        String city = sc.nextLine();

        System.out.print("age: ");
        int age = sc.nextInt();

        System.out.print("hobby: ");
        String hobby = sc.next();

        System.out.println("\n*****");

        System.out.printf("Человек по имени %s живёт в городе %s \n", name, city);
        System.out.printf("Этому человеку %d год и любит он заниматься %s \n", age, hobby);

        System.out.println("\n*****");

        System.out.printf("%s - name \n", name);
        System.out.printf("%s - city \n", city);
        System.out.printf("%s - age \n", age);
        System.out.printf("%s - hobby \n", hobby);

        sc.close();

    }
