package com.company.machikoro.entity;



public class FlowerShop extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    FlowerShop (Player owner)
    {
        this.name="Цветочный магазин";
        this.triggers = new byte[] {6};
        this.owner = owner;
        this.cardid = c_flower_shop;
        this.cost = 1;
        this.symbol = c_box;
    }
    public void effect()
    {
        super.effect();
        for (int x=1;x<this.owner.cards.size();x++) {
        if (this.owner.cards.get(x).cardid==c_flowers) { this.owner.addMoney(1+this.owner.TradeBonus());
        }
        }
        }


}