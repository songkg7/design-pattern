package com.design;

import com.design.strategy.unit.Fighter;
import com.design.strategy.unit.Helicopter;

public class App {

    public static void main(String[] args) {

        System.out.println("strategy");

        Fighter fighter = new Fighter();
        fighter.doAttack();
        fighter.doBomb();

        Helicopter helicopter = new Helicopter();
        helicopter.doAttack();
        helicopter.doBomb();

    }

}
