package saojavapractice;

public class Unit {
    private UnitType unitType;
    private String name;
    private Player owner;
    
    private double maxHP;
    private double maxMP;
    private double HP;
    private double MP;

    private double X;
    private double Y;
    private double angle;
    
    // Create a Unit of specified UnitType at location X and Y with facing angle.
    public Unit(UnitType unitType, Player owner, double X, double Y, double angle) {
        this.name = unitType.GetUnitTypeName();
        this.owner = owner;
        this.maxHP = unitType.maxHP;
        this.maxMP = unitType.maxMP;
        this.HP = unitType.maxHP;
        this.MP = unitType.maxMP;
    }

}
