package saojavapractice;

public class Hero extends Unit {
    private String title;
    private int level;
    private double EXP;

    public Hero(UnitType unitType, int health, int level) {
        //super(unitType, health);
        this.level = level;
    }

    public void useSpecialAbility() {
        System.out.println("Hero uses a special ability!");
    }

    // Additional methods specific to Hero (omitted for brevity)
}
