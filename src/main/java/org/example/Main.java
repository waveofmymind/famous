package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static int currentNum=1;

    public static void main(String[] args) {
        List<String> sayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine();
            if (cmd.equals("종료")) {
                break;
            }
            if (cmd.equals("등록")) {
                System.out.printf("명언 : ");
                String say = sc.nextLine();
                System.out.printf("작가 : ");
                String author = sc.nextLine();
                System.out.println(currentNum + "번 명언이 등록되었습니다.");
                currentNum++;
            }
        }
    }
}