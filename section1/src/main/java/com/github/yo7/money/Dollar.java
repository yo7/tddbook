package com.github.yo7.money;

public class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    String currency() {
        return "USD";
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
