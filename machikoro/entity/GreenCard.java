package com.company.machikoro.entity;

import javax.persistence.Entity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Entity(name = "machikoro$GreenCard")
public class GreenCard extends Card {
    private static final long serialVersionUID = 6959645959279473529L;
    public Boolean Condition()
    {
        return ((this.owner.game.currentPlayer==this.owner) & (super.Condition()));
    }
    protected Integer colorId = c_green;
}