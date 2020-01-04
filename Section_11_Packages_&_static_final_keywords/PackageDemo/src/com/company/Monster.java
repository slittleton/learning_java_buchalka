package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitpoints;
    private int strength;

    public Monster(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                '}';
    }


    @Override
    public List<String> write() { // saves data to list as strings
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitpoints);
        values.add(2, "" + this.strength);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        // convert data from List to integers(if needed) and save to object variables
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitpoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
