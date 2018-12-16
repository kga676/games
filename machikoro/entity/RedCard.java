package com.company.machikoro.entity;

import javax.persistence.Entity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Entity(name = "machikoro$RedCard")
public class RedCard extends Card {
    private static final long serialVersionUID = 1551701322601614713L;
    protected Integer colorId = c_red;
    public Boolean Condition ()
    {
        return ((this.owner!=this.owner.game.currentPlayer) & (super.Condition()));
    }
}