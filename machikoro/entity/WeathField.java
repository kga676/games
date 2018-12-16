package com.company.machikoro.entity;



public class WeathField extends BlueCard {
    private static final long serialVersionUID = 4817250371719304933L;
    WeathField (Player owner)
    {
        this.name="Пшеничное поле";
        this.triggers = new byte[] {1};
        this.owner = owner;
        this.cardid = c_weath_field;
        this.cost = 1;
        this.symbol = c_seed;
    }
    public void effect()
    {
        super.effect();
    this.owner.addMoney(1);
    }

}