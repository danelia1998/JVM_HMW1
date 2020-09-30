package com.company;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaskFromHomeworkN3 {
    static int a;
    static int b;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        enteringFromKeyboard();
        ifAIsBiggerThanBChangePlaces();
        int[] elementList = getRandomFourteenElementList();
        checkerForEvenAndOdd(elementList);
        int sumOfEventsFromList = sumOfEvens(elementList);
        int sumOfOddsFromList = sumOfOdds(elementList);
        fiveRandomNumbersFromGivenTwoNumbers(sumOfEventsFromList,sumOfOddsFromList);
    }

    public static void enteringFromKeyboard(){
        System.out.println("Please Enter any number two times (Use Key Enter for second number) :");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public static void ifAIsBiggerThanBChangePlaces(){
        int helper = 0;
        if(a>b){
            helper = b;
            b = a;
            a = helper;
        }
    }
    public static int[] getRandomFourteenElementList(){
        int[] Lister = new int[40];
        Random rand = new Random();
        int max = 0;
        int min = 0;

        if(a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        for(int i = 0; 40>i; i++){
            Lister[i] = rand.nextInt((max - min) + 1) + min;
            System.out.println(i+" element is: "+Lister[i]);
        }
        return Lister;
    }

    public static void checkerForEvenAndOdd(int[] forCheck){
        int even = 0;
        int odd = 0;
        for(int i = 0; forCheck.length>i; i++){
            if(forCheck[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("There is: "+even+" even numbers And There is: "+odd+" odd numbers!");
    }
    public static int sumOfEvens(int[] forCheck){
        int even = 0;
        int evenSum = 0;
        for(int i = 0; forCheck.length>i; i++){
            if(forCheck[i]%2==0){
                even++;
                evenSum = evenSum + forCheck[i];
            }
        }
        System.out.println("There is: "+even+" even its sum is : "+evenSum);
        return evenSum;
    }

    public static int sumOfOdds(int[] forCheck){
        int odd = 0;
        int oddSum = 0;
        for(int i = 0; forCheck.length>i; i++){
            if(forCheck[i]%2!=0){
                odd++;
                oddSum = oddSum + forCheck[i];
            }
        }
        System.out.println("There is: "+odd+" odds its sum is : "+oddSum);
        return oddSum;
    }

    public static int[] fiveRandomNumbersFromGivenTwoNumbers(int a, int b){
        Random rand = new Random();
        int[] Lister = new int[5];
        int max = 0;
        int min = 0;

        if(a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }
        for(int i = 0; 5>i; i++){
            Lister[i] = rand.nextInt((max - min) + 1) + min;
            System.out.println(i+" element is: "+Lister[i]);
        }
        return Lister;
    }
}
