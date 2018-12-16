package com.company.machikoro.entity;



public class Bank extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    Bank (Player owner)
    {
        this.name="Кредитнй банк";
        this.triggers = new byte[] {5,6};
        this.owner = owner;
        this.cardid = c_bank;
        this.cost = -5;
        this.symbol = c_case;
    }
    public void effect()
    {
        super.effect();
        this.owner.loseMoney(2);

    }
}