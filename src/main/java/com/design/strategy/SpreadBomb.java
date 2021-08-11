package com.design.strategy;

public class SpreadBomb implements BombAction {

    @Override
    public void bomb() {
        System.out.println("폭탄 투하!");
    }

}
