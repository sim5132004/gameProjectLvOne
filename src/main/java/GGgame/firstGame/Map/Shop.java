package GGgame.firstGame.Map;

import java.util.Scanner;

public class Shop extends Map{
    //포션2개만 있는데 나중에 더 추가가능
    int hpPotion=20;
    int spPotion=30;

    public int VisitShop(int money, int number){
        name="상점";
        System.out.println(name+"에 방문하였습니다");

        if(number==1){
            if(money>=hpPotion){
                return money-hpPotion;
            }
        }
        if (number == 2) {
            if(money>=spPotion){
                return money-spPotion;
            }
        }
        //돈부족하면
        return -1;
    }
}
