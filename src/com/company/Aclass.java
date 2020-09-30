package com.company;

import java.util.Scanner;

public class Aclass {
    static int x;
    static Scanner sc = new Scanner(System.in);

    public Aclass() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
    }

    public static void firstMethod(){
        x = sc.nextInt();
    }

    public static void secondMethod(){
        System.out.println(x+12);
    }

    public static void thirdMethod(){
        if(x%2==0){
            System.out.println("ლუწია");
        }else {
            System.out.println("კენტია");
        }
    }
}
