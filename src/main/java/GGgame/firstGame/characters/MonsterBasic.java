package GGgame.firstGame.characters;

import GGgame.firstGame.Item.HpPotion;
import GGgame.firstGame.Item.MpPotion;

import java.util.Random;

public class MonsterBasic extends Characters {

    public HpPotion hpPotion;
    public MpPotion mppotion;

    public MonsterBasic(String name, double hp, double maxhp, double ap, double sp, int money, int exp, int lv, String defaultAttack, HpPotion hpPotion, MpPotion mppotion) {
        super(name, hp, maxhp, ap, sp, money, exp, lv, defaultAttack);
        this.hpPotion = hpPotion;
        this.mppotion = mppotion;
    }

    @Override
    public int attack(Character target) {
        Random random =new Random();
        double pct =0.2*(random.nextInt(3)+5);
        int damage=0;
        if(this.ap>target){
            damage = (int)(this.ap-target)
        }
        return damage;
    }
}
