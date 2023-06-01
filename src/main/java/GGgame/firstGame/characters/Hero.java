package GGgame.firstGame.characters;

public class Hero extends Characters { //영웅클래스 추가

    public int ap;
    public int sp;

    public int money = 0;
    public int exp = 0;

    //hero->몬스터 공격하는 함수

    public int attack() {
        return ap;

    }

    //몬스터 => hero 공격함수
    public void attacked(int sum) {
        //sp가 받은 공격데미지보다 높을경우
        if(sp>=sum) {
            System.out.println("높은 방어력으로 인해 상대 공격 무효화");
            this.hp = hp - 0;
        }else{
            this.hp =hp+sp-sum;
        }
    }
}
