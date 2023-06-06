package GGgame.firstGame.characters;

abstract public class Characters {
    //기본 부모 캐릭터

    public String Name;
    public double Hp;

    public double Maxhp; // 캐릭터 최대 hp 무하노가다 방지
    public double Ap; // 공격력
    public double Sp; // 방어력
    public int Money;
    public int Exp;
    public int Lv;

    public String DefaultAttack; // 기본공격

//    public int vLv;//서비스로 구현




    public abstract int attack(Character character); //몬스터 공격했을때

    public Characters(String name, double hp, double maxhp, double ap, double sp, int money, int exp, int lv, String defaultAttack) {
        Name = name;
        Hp = hp;
        Maxhp = maxhp;
        Ap = ap;
        Sp = sp;
        Money = money;
        Exp = exp;
        Lv = lv;
        DefaultAttack = defaultAttack;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public double getMaxhp() {
        return Maxhp;
    }

    public void setMaxhp(double maxhp) {
        Maxhp = maxhp;
    }

    public double getAp() {
        return Ap;
    }

    public void setAp(double ap) {
        Ap = ap;
    }

    public double getSp() {
        return Sp;
    }

    public void setSp(double sp) {
        Sp = sp;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public int getLv() {
        return Lv;
    }

    public void setLv(int lv) {
        Lv = lv;
    }

    public String getDefaultAttack() {
        return DefaultAttack;
    }

    public void setDefaultAttack(String defaultAttack) {
        DefaultAttack = defaultAttack;
    }
}
