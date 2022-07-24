package com.veera.example;

public enum Directions {
    EAST("E"),
    WEST("W"),
    SOUTH("S"),
    NORTH("N");

    private final String shortCode;

    Directions(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getDirectionCode() {
        return this.shortCode;
    }
}