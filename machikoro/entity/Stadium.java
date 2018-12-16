package com.company.machikoro.entity;


public class Stadium extends PurleCard {
    private static final long serialVersionUID = -7087593117907360087L;
    Stadium (Player owner)
    {
        this.name="Стадион";
        this.triggers = new byte[] {6};
        this.owner = owner;
        this.cardid = c_stadium;
        this.cost = 6;
        this.symbol = c_radio;
    }
    public void effect ()
    {
        super.effect();
        for (int x=0;x<this.owner.game.players.size();x++)
        {
            if (this.owner.game.players.get(x) != this.owner)
            {
                this.owner.steal(2,this.owner.game.players.get(x));
            }
        }

    }
}