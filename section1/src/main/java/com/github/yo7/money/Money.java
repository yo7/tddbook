package com.github.yo7.money;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                    && getClass().equals(money.getClass());
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }
}
