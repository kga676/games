package com.company.machikoro.entity;

import javax.persistence.Entity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Entity(name = "machikoro$PurleCard")
public class PurleCard extends Card {
    private static final long serialVersionUID = -3348061470162641213L;
    public Boolean Condition()
    {
        return ((this.owner.game.currentPlayer==this.owner) & (super.Condition()));
    }

}