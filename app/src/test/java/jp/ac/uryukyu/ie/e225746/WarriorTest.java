package jp.ac.uryukyu.ie.e225746;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void attackTest() {
        Warrior demoWarrior = new Warrior("勇者", 10, 5);
        Enemy slime = new Enemy("スライムもどき", 1000, 0);
        for(int count=0; count<3; count++){
            int hpBeforeAattcked = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int hpAfterAattcked = slime.getHitPoint();
            assertEquals((int)(demoWarrior.getAttack()*1.5), hpBeforeAattcked - hpAfterAattcked);
        }
    }  
}