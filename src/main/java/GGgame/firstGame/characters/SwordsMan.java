package GGgame.firstGame.characters;

import java.util.Scanner;

public class SwordsMan extends Hero {
    public int attack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.강공격");
        System.out.println("2.공격");
        System.out.println("공격 종류를 선택하세요");
        int num = scanner.nextInt();

        int sum=0;
        //공격함수
        if(num==1){
            sum += lv*5;
            sum += ap*10;
            System.out.println("데미지는 "+sum+" 입니다");
            return sum;
        } else if (num == 2) {
            sum += lv*2;
            sum += ap*5;
            System.out.println("데미지는 "+sum+" 입니다");

        }
        System.out.println("데미지는 "+sum+ "입니다");
        return sum;
        }
        public void attacked(int sum){
            if(sp>= sum){
                hp= hp-0;
                System.out.println("높은 방어력으로 인해 공격 무효화");
            }else{
                hp= hp+ sp- sum;
            }
        }

    }


