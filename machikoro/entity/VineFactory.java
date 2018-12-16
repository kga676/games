package com.company.machikoro.entity;



public class VineFactory extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    VineFactory (Player owner)
    {
        this.name="Цветочный магазин";
        this.triggers = new byte[] {9};
        this.owner = owner;
        this.cardid = c_vine_factory;
        this.cost = 3;
        this.symbol = c_factory;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).cardid==c_grapes)
        { this.owner.addMoney(6);
        }
        }
        this.working=false;
        }


}