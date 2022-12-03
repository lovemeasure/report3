package jp.ac.uryukyu.ie.e225746;

public class Hero extends LivingThing{
    public Hero(String _name, int _maximumHP, int _attack){
        super(_name,_maximumHP,_attack); 
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}