package saojavapractice;

import java.util.ArrayList;
import java.util.List;

public class UnitType {
    private int unitTypeId;
    private String unitName;
    public double maxHP;
    public double maxMP;
    public List<Ability> abilities;

    public UnitType() {
        abilities = new ArrayList<>();
    }

    public String GetUnitTypeName() {
        return unitName;
    }
    
    public void addDefaultAbility(Ability ability) {
        abilities.add(ability);
    }

    public void removeDefaultAbility(Ability ability) {
        abilities.remove(ability);
    }

    public List<Ability> getDefaultAbilities() {
        return abilities;
    }
    
    public void SetUnitTypeMaxHP(double maxMP) {
        this.maxHP = maxHP;
    }

    public void SetUnitTypeMaxMP(double maxHP) {
        this.maxMP = maxMP;
    }
 
}
