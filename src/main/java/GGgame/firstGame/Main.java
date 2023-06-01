package GGgame.firstGame;

import GGgame.firstGame.Map.Shop;
import GGgame.firstGame.characters.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();

        System.out.println("---게임시작---");
        System.out.println("직업을 선택하세요");
        System.out.println("1.Swordsman");
        System.out.println("2.Wizard");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Swordsman 선택");
            hero = new SwordsMan();
            hero.ap = 30;
            hero.sp = 10;
            hero.lv = 1;
            hero.hp = 100;
        }
        if (num == 2) {
            System.out.println("Wizard 선택");
            hero = new Wizard();
            hero.ap = 20;
            hero.sp = 8;
            hero.lv = 1;
            hero.hp = 80;
            hero.mp = 130;
        }
        System.out.println("이름을 선택하세요");
        hero.name = scanner.next();
        System.out.println("이름을 입력하였습니다");
        System.out.println("게임을 시작합니다");

        while (true) {
            System.out.println("-------------------------------");
            System.out.println("현재 이름은 "+ hero.name);
            System.out.println("현재 레벨은" + hero.lv);
            System.out.println("현재 어택포인트는" + hero.ap);
            System.out.println("현재 방어도는 " + hero.sp);
            System.out.println("현재 hp " + hero.hp);
            System.out.println("현재 mp " + hero.mp);
            System.out.println("현재 돈" + hero.money);
            System.out.println("현재 경험치" + hero.exp);
            System.out.println("-------------------------------");

            System.out.println("1. 던전 입장");
            System.out.println("2. 상점 입장"); // 상점도 아직
            System.out.println("3. 집 들어가기"); //집 아직 구현안함
            System.out.println("들어갈 장소를 정하세요");
            num = scanner.nextInt();

            if (num == 1) {
                MonsterBasic monster = new MonsterBasic();
                System.out.println("던전에 입장하셨습니다");
                System.out.println("1. Cat");
                System.out.println("싸울 상대를 선택하세요");
                num = scanner.nextInt();

                if (num == 1) {
                    monster = new Cat();
                    monster.name = "Cat";
                    monster.hp = 300;
                    monster.lv = 1;
                    monster.sp = 15;
                    monster.ap = 10;
                    monster.money = 100;
                    monster.exp = 10;
                    System.out.println(monster.name + " 과 전투를 합니다");
                }
                while (true) {
                    System.out.println(hero.name + "의 공격");
                    monster.attacked(hero.attack());

                    if (monster.hp <= 0) {
                        System.out.println(monster.name + "가 죽었습니다");
                        hero.exp += monster.exp;
                        hero.money += monster.money;
                        break;
                    }
                    System.out.println(monster.name + "의 공격");
                    hero.attacked(monster.attack());
                    System.out.println(hero.name+"의 남은 체력은 "+hero.hp+"입니다.");

                    if (hero.hp <= 0) {
                        System.out.println(hero + "가 죽었습니다");
                        hero.hp = 10;
                        System.out.println(hero + "가 체력 " + hero.hp + "로 살아났습니다");
                        break;

                    }
                }
            }
            else if(num ==2){
                Shop shop =new Shop();

            }
            if(hero.exp >= hero.lv * 50){
                hero.lv+=1;
                System.out.println(hero.name+"의 레벨이"+hero.lv+"로 레벨업");
                hero.exp=0;

            }
        }
    }
}
