package com.github.yo7.money;

public class Dollar {
    public int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int i) {
        amount *= i;
    }
}
