package com.company.machikoro.entity;

//ЛЕЕЕЕЕССС!
//ЛЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕССС!
//ЛЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕЕССС!!

public class Forest extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Forest (Player owner)
    {
        this.name="Лес";
        this.triggers = new byte[] {5};
        this.owner = owner;
        this.cardid = c_forest;
        this.cost = 3;
        this.symbol = c_mech;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(1);
    }

}