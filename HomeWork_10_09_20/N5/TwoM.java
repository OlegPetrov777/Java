package com.company.N5;

import java.util.Arrays;
import java.util.Scanner;

public class TwoM {
    public static int[] mas1;
    public static int[] mas2;
    public static int Len = 0;
    public static int n;
    int[] mas3;

    public TwoM(int[] mas1, int[] p) {
        int count = 0;
        int len = Arrays.stream(p).sum();
        for (int i = 0; i < n; i++) {
            Len += p[i];
        }
        mas3 = new int[Len];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < p[i]; j++){
                mas3[count++] = mas1[i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве: ");
        n = scanner.nextInt();
        System.out.println(" ");
        mas1 = new int[n];
        mas2 = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите " + (i+1) + "-й элемент массива: ");
            int num = scanner.nextInt();
            mas1[i] = num;
        }
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Введите вес " + (i+1) + "-ого элемента массива: ");
            int num = scanner.nextInt();
            mas2[i] = num;
        }

        TwoM twom = new TwoM(mas1, mas2);

        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        System.out.println(Arrays.toString(twom.mas3));
        System.out.println(twom.mas3[(int)(Math.random() * twom.mas3.length)]);
    }
}