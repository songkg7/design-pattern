package com.design.strategy.unit;

import com.design.strategy.GuidedMissile;
import com.design.strategy.NoBomb;

public class Helicopter extends Unit {

    public Helicopter() {
        System.out.println("헬기 생산");
        shootAction = new GuidedMissile();
        bombAction = new NoBomb();
    }

}
