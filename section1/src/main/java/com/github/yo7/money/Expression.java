package com.github.yo7.money;

public interface Expression {
    Money reduce(Bank bank, String to);
}