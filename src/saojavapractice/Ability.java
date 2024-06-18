package saojavapractice;

public class Ability {
    private String abilityName;
    private String abilityDescription;
    private double costMP;
    private double cooldown;
    private int abilityLevel;
    
    // Declare New Ability
    public Ability(String abilityName, String abilityDescription, double costMP, double cooldown, int abilityLevel) {
        this.abilityName = abilityName;
        this.abilityDescription = abilityDescription;
        this.costMP = costMP;
        this.cooldown = cooldown;
        this.abilityLevel = abilityLevel;
    }
}
