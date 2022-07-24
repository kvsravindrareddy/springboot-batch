package com.veera.example;

public class EnumDemo {
    public static void main(String[] args) {
        for(Directions direct : Directions.values()) {
            System.out.println(direct);
        }
        Directions directions = Directions.EAST;
        System.out.println(directions.name());
        if(directions.name().equals("EAST")) {
            System.out.println("....its equals..."+directions.getDirectionCode());
        }
        if(directions == Directions.EAST)
        {
            System.out.println("East");
        } else if(directions == Directions.NORTH) {
            System.out.println("North");
        } else if(directions == Directions.SOUTH) {
            System.out.println("South");
        } else if (directions == Directions.WEST) {
            System.out.println("West");
        } else {
            System.out.println("None");
        }
    }
}