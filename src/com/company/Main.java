package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] a = new int[8][8];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí quân cờ đứng a[i][]:");
        int a1 = scanner.nextInt();
        System.out.print("Nhập vị trí quân cờ đứng a[][i]:");
        int a2 = scanner.nextInt();
        System.out.print("Nhập vị trí quân cờ muốn đi b[i][]:");
        int b1 = scanner.nextInt();
        System.out.print("Nhập vị trí quân cờ muốn đi b[][i]:");
        int b2 = scanner.nextInt();
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if ( b1 == (a1+2) && b2 ==(a2+1) ||
                        b1 ==(a1+1) && b2 ==(a2+2) ||
                        b1 ==(a1-1) && b2 ==(a2+2) ||
                        b1 ==(a1+2) && b2 ==(a2-1) ||
                        b1 ==(a1-2) && b2 ==(a2-1) ||
                        b1 ==(a1-1) && b2 ==(a2-2) ||
                        b1 ==(a1-2) && b2 ==(a2+1) ||
                        b1 ==(a1+1) && b2 ==(a2-2)){
                    if (a[i][j] == a[b1][b2]){
                        System.out.println("Đúng");
                        break;
                    }
                }
                else {
                    System.out.println("Sai");
                    break;
                }
            }
        }
    }
}
