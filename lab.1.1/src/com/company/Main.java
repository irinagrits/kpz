package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Grytsiv I.G.");
        int N;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        N = in.nextInt();
        int[][] arr = new int[N][N];
        for(int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.round(Math.random() * 100)) - 50;
            }
        }
        showMatrix(arr);
        System.out.println("Enter number of steps: ");
        int step = in.nextInt();
        shiftLeft2(arr, step);
        System.out.println();
        showMatrix(arr);
    }
    public static void shiftLeft2(int[][] arr, int steps) {
        for (int i = 0; i < arr.length; i++) {
            int realSteps = steps % arr[i].length;
            if (realSteps == 0)
                continue;
            int rowLength = arr[i].length;
            int[] temp = new int[rowLength];
            for (int j = 0; j < rowLength; j++) {
                int newIndex = (j - realSteps < 0) ? rowLength + j - realSteps : j - realSteps;
                temp[newIndex] = arr[i][j];
            }
            for (int j = 0; j < rowLength; j++) {
                arr[i][j] = temp[j];
            }
        }
    }
    public static void showMatrix(int[][] arr) {
        for (int[] s : arr) {
            for (int k : s) {
                System.out.printf("%4d", k, " ");
            }
            System.out.println();
        }
    }
}