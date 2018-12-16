package com.company.machikoro.entity;



public class CornField extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    CornField (Player owner)
    {
        this.name="Кукурузное поле";
        this.triggers = new byte[] {3,4};
        this.owner = owner;
        this.cardid = c_corn_field;
        this.cost = 2;
        this.symbol = c_seed;
    }
    public Boolean Condition()
    {
        return (super.Condition() & this.owner.BigCount()<2);
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(1);
    }

}