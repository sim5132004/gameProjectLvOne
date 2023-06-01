package GGgame.firstGame.characters;

public class MonsterBasic extends Characters {
    public int ap;
    public int sp;
    public int money;
    public int exp;

    //몬스터->히어로 공격함수
    public int attack() {
        return ap;
    }

    //히어로->몬스터 공격 받는 함수
    public void attacked(int sum){
        if(sp>= sum){
            hp= hp-0; //방어가 attack 보다 높으면
        }else{
            hp= hp+ sp- sum;
        }
    }
}
