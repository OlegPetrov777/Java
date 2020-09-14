// №1
package com.company.N1;

public class Matrix {
    public static void main(String[] args) {
        int k = 6; // k-число для *
        int[][] nums = {{52, 7}, {9, 45}};
        int[][] nums2 = {{21, 3}, {37, 9}};
        int[][] nums_sum = new int[2][2];
        int[][] nums_minus = new int[2][2];
        int[][] nums_umn = new int[2][2];
        int[][] nums_umn_m = new int[2][2];
        int[][] nums_step = new int[2][2];
        int[][] nums_d = new int[2][2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Nums_" + i + "." + j + ". - " + nums[i][j]);
            }
        }
        System.out.println("\n");
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.println("Nums2_" + i + "." + j + ". - " + nums2[i][j]);
            }
        }

        summa(nums,nums2,nums_sum);
        minus(nums,nums2,nums_minus);
        multiplication(nums,k,nums_umn);
        multiplication_m(nums,nums2,nums_umn_m);
        transponir(nums,nums_d);
        step(nums,nums_step);
    }

    // №1 (а.)
    private static int[][] summa(int[][] nums, int[][] nums2, int[][] nums_sum) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums_sum[i][j] = nums[i][j] + nums2[i][j];
            }
        }
        System.out.println("\n" + "Сумма матриц (nums_sum) = nums + nums2");
        for (int i = 0; i < nums_sum.length; i++) {
            for (int j = 0; j < nums_sum[i].length; j++) {
                System.out.println("Nums_sum_" + i + "." + j + ". - " + nums_sum[i][j]);
            }
        }
        return nums_sum;
    }
    // №1 (а.)
    private static int[][] minus(int[][] nums, int[][] nums2, int[][] nums_minus) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums_minus[i][j] = nums[i][j] - nums2[i][j];
            }
        }
        System.out.println("\n" + "Разность матриц (nums_minus) = nums - nums2");
        for (int i = 0; i < nums_minus.length; i++) {
            for (int j = 0; j < nums_minus[i].length; j++) {
                System.out.println("nums_minus_" + i + "." + j + ". - " + nums_minus[i][j]);
            }
        }
        return nums_minus;
    }
    // №1 (b.)
    private static int[][] multiplication(int[][] nums, int k, int[][] nums_umn) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums_umn[i][j] = nums[i][j] * k;
            }
        }
        System.out.println("\n" + "Умножение матрицы nums на чило k = nums_umn");
        for (int i = 0; i < nums_umn.length; i++) {
            for (int j = 0; j < nums_umn[i].length; j++) {
                System.out.println("nums_umn_" + i + "." + j + ". - " + nums_umn[i][j]);
            }
        }
        return nums_umn;
    }
    // №1 (c.)
    private static int[][] multiplication_m(int[][] nums, int[][] nums2, int[][] nums_umn_m) {
        nums_umn_m[0][0] = nums[0][0]*nums2[0][0] + nums[0][1]*nums2[1][0];
        nums_umn_m[0][1] = nums[0][0]*nums2[0][1] + nums[0][1]*nums2[1][1];
        nums_umn_m[1][0] = nums[1][0]*nums2[0][0] + nums[1][1]*nums2[1][0];
        nums_umn_m[1][1] = nums[1][0]*nums2[0][1] + nums[1][1]*nums2[1][1];

        System.out.println("\n" + "Умножение матрицы nums на матрицу nums2 = nums_umn_m");
        for (int i = 0; i < nums_umn_m.length; i++) {
            for (int j = 0; j < nums_umn_m[i].length; j++) {
                System.out.println("nums_umn_m_" + i + "." + j + ". - " + nums_umn_m[i][j]);
            }
        }
        return nums_umn_m;
    }
    // №1 (d.)
    private static int[][] transponir(int[][] nums, int[][] nums_d) {
        for(int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums_d[i][j] = nums[j][i];
            }
        }
        System.out.println("\n" + "Транспонированная матрица (nums_d) из матрицы nums");
        for (int i = 0; i < nums_d.length; i++) {
            for (int j = 0; j < nums_d[i].length; j++) {
                System.out.println("nums_umn_m_" + i + "." + j + ". - " + nums_d[i][j]);
            }
        }
        return nums_d;
    }
    // №1 (e.)
    private static int[][] step(int[][] nums, int[][] nums_step) {
        nums_step[0][0] = nums[0][0]*nums[0][0] + nums[0][1]*nums[1][0];
        nums_step[0][1] = nums[0][0]*nums[0][1] + nums[0][1]*nums[1][1];
        nums_step[1][0] = nums[1][0]*nums[0][0] + nums[1][1]*nums[1][0];
        nums_step[1][1] = nums[1][0]*nums[0][1] + nums[1][1]*nums[1][1];
        System.out.println("\n" + "Возведение матрицы nums в квадрат = nums_umn_m");
        for (int i = 0; i < nums_step.length; i++) {
            for (int j = 0; j < nums_step[i].length; j++) {
                System.out.println("nums_step_" + i + "." + j + ". - " + nums_step[i][j]);
            }
        }
        return nums_step;
    }

}