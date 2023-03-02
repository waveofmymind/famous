package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("== 명언 앱 ==");
            System.out.printf("명령) ");
            String cmd = sc.nextLine();
            if (cmd.equals("종료")) {
                break;
            }
        }
    }
}