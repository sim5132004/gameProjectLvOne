package GGgame.firstGame.Map;

import GGgame.firstGame.Item.Armor;
import GGgame.firstGame.Item.HpPotion;
import GGgame.firstGame.Item.MpPotion;
import GGgame.firstGame.Item.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    //포션2개만 있는데 나중에 더 추가가능

    public ArrayList<Weapon>weapons;
    public ArrayList<Armor>armors;
    public ArrayList<HpPotion>hpPotions;
    public ArrayList<MpPotion>mpPotions;

    public Shop(ArrayList<Weapon> weapons, ArrayList<Armor> armors, ArrayList<HpPotion> hpPotions, ArrayList<MpPotion> mpPotions) {
        this.weapons = weapons;
        this.armors = armors;
        this.hpPotions = hpPotions;
        this.mpPotions = mpPotions;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    public ArrayList<Armor> getArmors() {
        return armors;
    }

    public void setArmors(ArrayList<Armor> armors) {
        this.armors = armors;
    }

    public ArrayList<HpPotion> getHpPotions() {
        return hpPotions;
    }

    public void setHpPotions(ArrayList<HpPotion> hpPotions) {
        this.hpPotions = hpPotions;
    }

    public ArrayList<MpPotion> getMpPotions() {
        return mpPotions;
    }

    public void setMpPotions(ArrayList<MpPotion> mpPotions) {
        this.mpPotions = mpPotions;
    }
}
