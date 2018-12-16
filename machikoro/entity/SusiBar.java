package com.company.machikoro.entity;


import com.sun.org.apache.xpath.internal.operations.Bool;

public class SusiBar extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    SusiBar (Player owner)
    {
        this.name="Суси-бар";
        this.triggers = new byte[] {1};
        this.owner = owner;
        this.cardid = c_susi_bar;
        this.cost = 3;
        this.symbol = c_cup;
    }
    public Boolean Condition()
    {
        return (super.Condition() & this.owner.port);
    }
    public void effect ()
    {
        super.effect();
        this.owner.steal(3+this.owner.TradeBonus(),this.owner.game.currentPlayer);
    }
}