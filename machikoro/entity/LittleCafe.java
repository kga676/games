package com.company.machikoro.entity;



public class LittleCafe extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    LittleCafe (Player owner)
    {
        this.name="Закусочная";
        this.triggers = new byte[] {9,10};
        this.owner = owner;
        this.cardid = c_little_cafe;
        this.cost = 3;
        this.symbol = c_cup;
    }
    public void effect ()
    {
        super.effect();
        this.owner.steal(2+this.owner.TradeBonus(),this.owner.game.currentPlayer);
    }
}