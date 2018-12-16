package com.company.machikoro.entity;



public class Restaurant extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    Restaurant (Player owner)
    {
        this.name="";
        this.triggers = new byte[] {5};
        this.owner = owner;
        this.cardid = c_restaurant;
        this.cost = 3;
        this.symbol = c_cup;
    }
    public void effect ()
    {
        super.effect();
        if (this.owner.game.currentPlayer.BigCount()>1) {
            this.owner.steal(5 + this.owner.TradeBonus(), this.owner.game.currentPlayer);
        }
    }
}