package com.company.machikoro.entity;



public class FurnitureFactory extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    FurnitureFactory (Player owner)
    {
        this.name="Мебельная фабрика";
        this.triggers = new byte[] {8};
        this.owner = owner;
        this.cardid = c_furniture_factory;
        this.cost = 3;
        this.symbol = c_factory;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).symbol==c_mech) { this.owner.addMoney(3);
        }
        }
        }


}