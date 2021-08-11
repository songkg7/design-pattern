package com.design.template;

abstract public class Pizza {

    protected void dough() {
        System.out.println("반죽!");
    }

    abstract void topping();

    protected void baking() {
        System.out.println("굽기!");
    }

    // 상속받은 클래스에서 수정 불가
    public final void makePizza() {
        this.dough();
        this.topping();
        this.baking();
    }

}
