package com.design.strategy;

public class NoBomb implements BombAction {

    @Override
    public void bomb() {
        System.out.println("이 유닛은 폭탄이 없습니다.");
    }

}
