package GGgame.firstGame.characters;

import java.util.Scanner;

public class Wizard extends Hero {
    public int attack() {
        Scanner scanner = new Scanner(System.in);
        //마법사는 기본공격못함
        int sum = 0;
        if (mp >= 0) {
            System.out.println("1.번개");
            System.out.println("2.불");
            System.out.println("마법 종류를 선택하세요");
            int num = scanner.nextInt();
            //번개
            if (num == 1) {
                sum += lv * 15;
                sum += ap * 20;
                sum += sp * 10;
                System.out.println("가한 마법 데미지는 " + sum + " 입니다");
                mp = mp - 10;
                return sum;
            } else if (num == 2) {
                sum += lv * 20;
                sum += ap * 20;
                sum += sp * 20;
                System.out.println("가한 마법 데미지는" + sum + " 입니다");
                mp = mp - 20;
                return sum;
            }
            System.out.println("가한 마법 데미지는 " + sum + " 입니다");
            return sum;
        }else{
            //mp 없으면
            System.out.println("mp가 없습니다");
            return sum;
        }
    }

    public void attacked(int sum){
        if(sp>= sum){
            hp= hp-0;
        }else{
            hp= hp+ sp- sum;
        }
    }
}