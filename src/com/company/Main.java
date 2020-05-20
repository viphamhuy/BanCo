package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] banCo = new int[8][8];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí quân tịnh đứng :");
        String viTriBatDau = scanner.nextLine();
        int x = (viTriBatDau.charAt(0) - 96);
        int y = Integer.parseInt(String.valueOf(viTriBatDau.charAt(1)));

        BanCo tinh1 = new BanCo(x, y);
        System.out.print("Nhập vị trí quân tịnh đến :");
        String viTriDen = scanner.nextLine();
        int x1 = (viTriDen.charAt(0) - 96);
        int y1 = Integer.parseInt(String.valueOf(viTriDen.charAt(1)));
        BanCo tinh2 = new BanCo(x1, y1);
        boolean check = tinh1.diChuyen(tinh1, tinh2);
        for (int i = 0; i < banCo.length; i++) {
            for (int j = 0; j < banCo[i].length; j++) {
                if (check) {
                    if (banCo[i][j] == banCo[x1][y1]) {
                        System.out.println("Đúng");
                        break;
                    }
                } else {
                    System.out.println("Sai");
                    break;
                }
            }
        }
    }

}
