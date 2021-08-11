package com.design;

import com.design.template.PotatoPizza;
import com.design.template.TomatoPizza;

public class App {

    public static void main(String[] args) {

        PotatoPizza potatoPizza = new PotatoPizza();
        potatoPizza.makePizza();

        TomatoPizza tomatoPizza = new TomatoPizza();
        tomatoPizza.makePizza();

    }

}
