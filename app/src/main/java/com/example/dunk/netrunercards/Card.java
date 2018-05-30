package com.example.dunk.netrunercards;

import java.io.Serializable;

import enums.Factions;
import enums.RunnerCardType;

public class Card implements Serializable{


    private String name;
    private RunnerCardType type;
    private int cost;
    private Factions faction;
    private int influence;
    private int number;

    public Card(String name, RunnerCardType type, int cost, Factions faction, int influence, int number) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.faction = faction;
        this.influence = influence;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public RunnerCardType getType() {
        return this.type;
    }

    public int getCost() {
        return this.cost;
    }

    public Factions getFaction() {
        return this.faction;
    }

    public int getInfluence() {
        return this.influence;
    }

    public int getNumber() {
        return this.number;
    }

}
