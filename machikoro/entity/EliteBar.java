package com.company.machikoro.entity;



public class LittleCafe extends RedCard {
    private static final long serialVersionUID = -7087593117907360087L;
    LittleCafe (Player owner)
    {
        this.name="Закусочная";
        this.triggers = new byte[] {12,13,14};
        this.owner = owner;
        this.cardid = c_elite_bar;
        this.cost = 4;
        this.symbol = c_cup;
    }
    public void effect ()
    {
        super.effect();
        if (this.owner.game.currentPlayer.BigCount()>2) {
            this.owner.steal(this.owner.game.currentPlayer.money, this.owner.game.currentPlayer);
        }
    }
}