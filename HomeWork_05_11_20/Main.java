package com.company;

import java.util.Scanner;


//        1) Дано натуральное число n. Выведите все числа от 1 до n.
//        2) Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
//        Используйте перебор и двоичный поиск для решения этой задачи. Сравните время
//        выполнения обоих решений для больших массивов (например, 100000000 элементов).
//        3) Найдите корень уравнения на отрезке [0;10] с точностью по x не хуже 0.001. Известно, что
//        на этом промежутке корень единственный. Используйте для этого метод деления отрезка
//        пополам (и рекурсию).
//        4) Реализуйте бинарное дерево поиска

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        int j = 0;
        int[] list = {1,2,3,4,5,6,7,8,9,0};


        RecursionNumbers(n);
        CheckList(n, list);
        RecursionCheckList(n, list, j);
    }

    // N.1
    static int RecursionNumbers(int n){

        if (n == 0) {
            return 0;
        }
        else {
            System.out.println(n);
            return RecursionNumbers(n - 1);
        }
    }

    // N.2
    static boolean CheckList(int n, int[] list){
        for(int i=0;i < list.length;i++){
            if (n == list[i]){
                return true;
            }
        }
        return false;
    }

    static boolean RecursionCheckList(int n, int[] list, int j){
        if (j < list.length){
            if (n == list[j]){
                return true;
            }
            j += 1;
            RecursionCheckList(n, list, j);
        }
        return false;
    }

}
