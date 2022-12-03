package jp.ac.uryukyu.ie.e225746;

public class Warrior extends LivingThing{
    public Warrior(String _name, int _maximumHP, int _attack){
        super(_name,_maximumHP,_attack); 
    }

    public void attackWithWeponSkill(LivingThing livingthing){
        if (this.dead == false){
            int damage = (int)(attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, livingthing.getName(), damage);
            livingthing.wounded(damage);
        }
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }

}
