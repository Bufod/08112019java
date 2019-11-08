package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr1 = new int[n][n], arr2 = new int[n][n];
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = 1 + (int) (Math.random() * 10);
                arr2[i][j] = 1 + (int) (Math.random() * 10);
            }

        // Вывод 1 матрицы
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print("\t" + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //Вывод 2 матрицы
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print("\t" +arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        // результат (сложение)
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print("\t" + (arr2[i][j] + arr1[i][j]));
            }
            System.out.println();
        }

        //я изменил файл, обновите
    }
}

