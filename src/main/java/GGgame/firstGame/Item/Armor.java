package GGgame.firstGame.Item;

public class Armor extends Item {

    public double sp;

    public Armor(String name, int price, double sp) {
        super(name, price);
        this.sp = sp;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }
}
