package com.company.machikoro.entity;



public class Busters extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    Busters (Player owner)
    {
        this.name="Демонтажная компания";
        this.triggers = new byte[] {4};
        this.owner = owner;
        this.cardid = c_busters;
        this.cost = 2;
        this.symbol = c_case;
    }
    public void effect()
    {
        super.effect();
        if (this.owner.BigCount()>0) {
            this.owner.game.ChooseBig(this.owner);
            this.owner.addMoney(8);
        }

    }
}