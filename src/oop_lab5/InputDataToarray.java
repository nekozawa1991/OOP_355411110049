package oop_lab5;

import java.util.Scanner;

public class InputDataToarray {
    private static final int MAX = 10;

    public static void main(String[] args) {
        int num[] = new int[MAX];
        num = inputData(num);
        ShowData(num);
    }//main

    private static void summation(int[] num){
        int total = 0;
        for (int i=0;i<num.length;i++){
            total += num[i];
        }
        System.out.println("\nThe summation of " + "value in array is: "+total);
        System.out.println("The avrage value " + "in array is: "+total/MAX);
    }

    private static void ShowData(int[] num) {
        System.out.println("Data in array: ");
        for (int val: num)
            System.out.print(val+" ");
    }

    private static int[] inputData(int[] num) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter data to array:");
        for (int i=0;i<num.legth;i++){
            System.out.print("num["+i+"]");
            num[i]=scanner.nextInt();

        }
        return num;
    }
}
