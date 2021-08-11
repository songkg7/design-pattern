package com.design.strategy;

public class OneWayMissile implements ShootAction {

    @Override
    public void attack() {
        System.out.println("직선 미사일 발사!");
    }

}
