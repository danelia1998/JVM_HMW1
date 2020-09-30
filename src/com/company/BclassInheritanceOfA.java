package com.company;

public class BclassInheritanceOfA extends Aclass {
    static int y;

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
        firstMethod2();
        System.out.println(secondMethod2());
    }

    public static void firstMethod2(){
        y = sc.nextInt();
    }

    public static int secondMethod2(){
        return x+y;
    }

}
