package com.github.yo7.money;

public class Dollar {
    public int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        amount *= multiplier;
        return null;
    }
}
