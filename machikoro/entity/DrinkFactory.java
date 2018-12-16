package com.company.machikoro.entity;



public class DrinkFactory extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    DrinkFactory (Player owner)
    {
        this.name="Фабрика напитков";
        this.triggers = new byte[] {11};
        this.owner = owner;
        this.cardid = c_drink_factory;
        this.cost = 5;
        this.symbol = c_factory;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).symbol==c_cup) { this.owner.addMoney(1);
        }
        }
        }


}