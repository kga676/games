package com.company.machikoro.entity;



public class CheeseFactory extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    CheeseFactory (Player owner)
    {
        this.name="Сыроварня";
        this.triggers = new byte[] {7};
        this.owner = owner;
        this.cardid = c_cheese_factory;
        this.cost = 5;
        this.symbol = c_factory;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).symbol==c_cow) { this.owner.addMoney(3);
        }
        }
        }


}