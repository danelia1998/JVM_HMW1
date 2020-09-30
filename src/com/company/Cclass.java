package com.company;

import java.util.Scanner;

public class Cclass {
    static int a;
    static int b;
    static int c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
        fourMethod();
        sixhMethod();
    }

    public static void firstMethod(){
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }
    public static int secondMethod(){
        String fromA = String.valueOf(a);
        return Character.getNumericValue(fromA.charAt(fromA.length()-1));
    }

    public static int thirdMethod(){
        String fromB = String.valueOf(b);
        return Character.getNumericValue(fromB.charAt(0));
    }

    public static int fourMethod(){
        String fromC = String.valueOf(c);
        int sum = 0;
        for (int i = 0; fromC.length()>i; i++){
            sum = sum + Character.getNumericValue(fromC.charAt(i));
        }
        System.out.println(sum);
        return sum;
    }

    public static int fifthMethod(){
        System.out.println(secondMethod()*thirdMethod());
        return secondMethod()*thirdMethod();
    }

    public static void sixhMethod(){
        System.out.println(thirdMethod()+fifthMethod());
    }


}
