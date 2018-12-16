package com.company.machikoro.entity;



public class FruitMarket extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    FruitMarket (Player owner)
    {
        this.name="Овощной рынок";
        this.triggers = new byte[] {11,12};
        this.owner = owner;
        this.cardid = c_fruit_market;
        this.cost = 2;
        this.symbol = c_fruit;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).symbol==c_seed) { this.owner.addMoney(2);
        }
        }
        }


}