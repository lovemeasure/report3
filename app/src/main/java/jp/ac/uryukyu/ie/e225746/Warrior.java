package jp.ac.uryukyu.ie.e225746;

public class Warrior extends Hero{
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
}
