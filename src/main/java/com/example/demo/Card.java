package com.example.demo;

public class Card {
    private int cardNumber;
    private int pin;
    private String name;
    private int currentBalance;

    public Card(int cardNumber, int pin, String name, int currentBalance) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
        this.currentBalance = currentBalance;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card Number=" + cardNumber +
                ", pin= " + pin +
                ", name= " + name +
                '}';
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
}
