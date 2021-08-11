package com.design.strategy;

public class GuidedMissile implements ShootAction {

    @Override
    public void attack() {
        System.out.println("유도미사일 발사!");
    }

}
