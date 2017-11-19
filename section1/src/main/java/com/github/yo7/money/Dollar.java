package com.github.yo7.money;

public class Dollar extends Money {
    private String currency;

    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    @Override
    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
