package com.company.machikoro.entity;



public class Cafe extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    Cafe (Player owner)
    {
        this.name="Кафе";
        this.triggers = new byte[] {3};
        this.owner = owner;
        this.cardid = c_cafe;
        this.cost = 2;
        this.symbol = c_cup;
    }
    public void effect ()
    {
        super.effect();
        this.owner.steal(1+this.owner.TradeBonus(),this.owner.game.currentPlayer);
    }
}