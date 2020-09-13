package com.company;
import java.util.Scanner;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println("Hello World");
        //2
        int n;
        n = 10;
        System.out.println("n=" + n);
        //3
    	int n2, n3;
    	n2 = 3;
        n3 = ++n2;
        n2 += 1;
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        //5
        double a = 5.0, b = 9.0 ,c;
        c = sqrt(a*a + b*b);
        System.out.println("Катеты = 5, 9; гипотенуза = " + c);
        //6
        int n4 = 23456;
        n4 %= 10;
        System.out.println("n4=" + n4);
        //7
        int n5 = 45678;
        n5 %= 100;
        n5 /=10;
        System.out.println("n5=" + n5);
        //8
        int n6=98;
        n6 /= 10;
        System.out.println("n6=" + n6);

        ex9();
        ex10();
        ex11();
        ex12();
    }
    static void ex9 (){
        Scanner num = new Scanner(System.in);
        int k,k2,f;
        System.out.println("Введите число. ");

        k = num.nextInt();
        k2= 21;
        f = k - k2;

        System.out.println("Разница между "+ k + " и 21 равна " + f);
    }
    static void ex10 () {
        Scanner num = new Scanner(System.in);
        int k, k2;
        float Sr;

        System.out.println("Введите число №1 ");
        k = num.nextInt();

        System.out.println("Введите число №2 ");
        k2 = num.nextInt();

        Sr = (k + k2) / 2;
        System.out.println("Среднее арифметическое значение числа " + k + " и " + k2 + " равно " + Sr);
    }
    static void ex11 () {
        Scanner num = new Scanner(System.in);
        int k, k2;
        float Sr;

        System.out.println("Введите число №1 ");
        k = num.nextInt();

        System.out.println("Введите число №2 ");
        k2 = num.nextInt();

        Sr = (float) sqrt(k*k2);
        System.out.println("Среднее геометрическое значение числа " + k + " и " + k2 + " равно " + Sr);
    }
    static void ex12 () {
        Scanner num = new Scanner(System.in);
        int x1, x2, y1, y2;
        float S;

        System.out.println("Введите число x1 ");
        x1 = num.nextInt();
        System.out.println("Введите число y1 ");
        y1 = num.nextInt();
        System.out.println("Введите число x2 ");
        x2 = num.nextInt();
        System.out.println("Введите число y2 ");
        y2 = num.nextInt();

        S = (float) sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1) );
        System.out.println("Длинна от точки (" + x1 +";"+ y1 + ") до точки (" + x2 +";"+ y2 + ") равно " + S);
    }
}

