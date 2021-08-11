package com.design.strategy.unit;

import com.design.strategy.BombAction;
import com.design.strategy.ShootAction;

public class Unit {

    public ShootAction shootAction;
    public BombAction bombAction;

    public void doAttack() {
        shootAction.attack();
    }

    public void doBomb() {
        bombAction.bomb();
    }

    public void doDisplay() {

    }

}
