package com.company.machikoro.entity;



public class Mine extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    Mine (Player owner)
    {
        this.name="Шахта";
        this.triggers = new byte[] {9};
        this.owner = owner;
        this.cardid = c_mine;
        this.cost = 6;
        this.symbol = c_mech;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(5);
    }

}