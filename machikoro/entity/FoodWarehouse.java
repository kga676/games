package com.company.machikoro.entity;



public class FoodWarehouse extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    FoodWarehouse (Player owner)
    {
        this.name="Продуктовый склад";
        this.triggers = new byte[] {12,13};
        this.owner = owner;
        this.cardid = c_food_warehouse;
        this.cost = 2;
        this.symbol = c_factory;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).symbol==c_cup) { this.owner.addMoney(2);
        }
        }
        }


}