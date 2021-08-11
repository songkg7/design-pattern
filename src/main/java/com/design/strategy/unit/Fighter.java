package com.design.strategy.unit;

import com.design.strategy.OneWayMissile;
import com.design.strategy.SpreadBomb;

public class Fighter extends Unit {

    public Fighter() {
        System.out.println("전투기 생산");
        shootAction = new OneWayMissile();
        bombAction = new SpreadBomb();
    }

}
