package GGgame.firstGame.characters;

public class Cat extends MonsterBasic{
    public int attack(){
        System.out.println("데미지는 "+ap+" 입니다 ");
        return ap;
    }

    //몬스터 종류도 곧 추가함
    //공격 종류 추가해도됨
    public void attacked(int sum) {
        if (sp >= sum) {
            hp = hp - 0; //방어가 attack 보다 높으면
        } else {
            hp = hp + sp - sum;
        }
    }
}
