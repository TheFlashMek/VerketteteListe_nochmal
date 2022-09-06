package de.mekalan;

public class Player {

    private String name;
    private double value;
    private String team;

    Player(String name, double value, String team) {
        this.name = name;
        this.value = value;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    public double getvalue() {
        return value;
    }

    public void setvalue() {
        this.value = value;
    }

    public String getteam() {
        return team;
    }

    public void setteam() {
        this.team = team;
    }

    public void print() {
        System.out.println("\n name");
        System.out.println("\n value");
        System.out.println("\n team");
    }

    public String toString() {
        return name + "\n" + value + "\n" + team + "\n\n";
    }
}
