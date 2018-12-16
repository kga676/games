package com.company.machikoro.entity;



public class Delivery extends GreenCard {
    private static final long serialVersionUID = 8160445399896388612L;
    Delivery (Player owner)
    {
        this.name="Транспортная компания";
        this.triggers = new byte[] {9,10};
        this.owner = owner;
        this.cardid = c_delivery;
        this.cost = 2;
        this.symbol = c_case;
    }
    public void effect()
    {
        super.effect();
        Player victim = this.owner.game.ChoosePlayer();
        Card target_card = this.owner.game.ChooseCard(victim);

        Card my_card  = this.owner.game.ChooseCard(this.owner);
        this.owner.addMoney(4);
        //Меняем хозяев картам
        target_card.changeowner(this.owner);
        my_card.changeowner(victim);



    }
}