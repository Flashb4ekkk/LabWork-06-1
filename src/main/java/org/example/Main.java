package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] c = new int[27];
        initArray(c);
        System.out.print("full array : ");
        printArray(c);
        int[] value = processArray(c);
        System.out.println("\nsum = " + value[1]);
        System.out.println("counter = " + value[0]);
        System.out.print("modif array : ");
        printArray(c);
    }
    public static void printArray (int[] c){
        for (int e: c) {
            System.out.print(e + " ");
        }
    }
    public static void initArray(int[] c){
        Random rand = new Random();
        for(int i = 0; i < c.length; i++){
            c[i] = rand.nextInt(61) - 35;
        }
    }
    public static int[] processArray(int[] c) {
        int[] result = new int[2];
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0 || c[i] % 2 != 0) {
                result[0]++;
                result[1] += c[i];
                c[i] = 0;
            }
        }
        return result;
    }
}
