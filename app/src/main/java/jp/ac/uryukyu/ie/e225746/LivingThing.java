package jp.ac.uryukyu.ie.e225746;

public class LivingThing {
    protected String name;
    protected int hitPoint;
    protected int attack;
    protected boolean dead;

    public LivingThing(String _name, int _maximumHP, int _attack){
        this.name = _name;
        hitPoint = _maximumHP;
        this.attack = _attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", _name, _maximumHP, _attack);
    }

    public boolean isDead(){
        return dead;
    }
    public String getName(){
        return this.name;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }

    public void attack(LivingThing livingthing){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, livingthing.getName(), damage);
            livingthing.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", this.name);
        }
    }
}
