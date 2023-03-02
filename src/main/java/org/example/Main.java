package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    private static int currentNum = 1;

    public static void main(String[] args) throws IOException {
        System.out.println("프로그램 다시 시작...\n\n");
        HashMap<Integer, Say> sayList = FileReader.read();

        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        while (true) {
            System.out.printf("명령) ");
            String cmd = sc.nextLine();
            if (cmd.equals("종료")) {
                break;
            }
            if (cmd.equals("등록")) {
                Say say = new Say();
                System.out.printf("명언 : ");
                say.setContent(sc.nextLine());
                System.out.printf("작가 : ");
                say.setAuthor(sc.nextLine());
                System.out.println(currentNum + "번 명언이 등록되었습니다.");
                sayList.put(currentNum, say);
                currentNum++;

            }
            if (cmd.equals("목록")) {
                List<Integer> keys = new ArrayList<Integer>(sayList.keySet());
                Collections.reverse(keys);
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (Integer key : keys) {
                    System.out.println(key + " / " + sayList.get(key).getAuthor() + " / " + sayList.get(key).getContent());
                }
            }
            if (cmd.startsWith("삭제")) {
                int targetId = Integer.parseInt(cmd.split("=")[1]);
                if (sayList.containsKey(targetId)) {
                    sayList.remove(targetId);
                    System.out.println(targetId + "번 명언이 삭제되었습니다.");
                } else {
                    System.out.println(targetId + "번 명언은 존재하지 않습니다.");
                }
            }
            if (cmd.startsWith("수정")) {
                int targetId = Integer.parseInt(cmd.split("=")[1]);
                Say curSay = sayList.get(targetId);
                System.out.println("명언(기존) : " + curSay.getContent());
                System.out.printf("명언 : ");
                String newContent = sc.nextLine();
                curSay.setContent(newContent);
                System.out.println("작가(기존) : " + curSay.getAuthor());
                System.out.printf("작가 : ");
                String newAuthor = sc.nextLine();
                curSay.setAuthor(newAuthor);
                sayList.put(targetId,curSay);
            }
            if (cmd.equals("빌드")) {
                ArrayList<Say> arr = new ArrayList<>();
                for (Integer key : sayList.keySet()) {
                    Say newSayList = new Say(key,sayList.get(key).getAuthor(),sayList.get(key).getContent());
                    arr.add(newSayList);
                }
                JsonSave.save(arr);
                System.out.println("data.json 파일의 내용이 갱신되었습니다.");

            }

        }

        FileWriter.write(sayList);


    }
}