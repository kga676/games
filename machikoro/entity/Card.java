package com.company.machikoro.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "MACHIKORO_CARD")
@Entity(name = "machikoro$Card")
public class Card extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 784315873475032444L;
    //Блок констант символов на картах начала
    public static final int c_seed = 1;
    public static final int c_cup = 2;
    public static final int c_cow = 3;
    public static final int c_box = 4;
    public static final int c_case = 5;
    public static final int c_mech = 6;
    public static final int c_radio = 7;
    public static final int c_factory = 8;
    public static final int c_boat = 9;
    public static final int c_fruit = 10;
    //Конец блока констант символов на картах
    //Блок констант цветов карт начало
    public static final int c_red = 1;
    public static final int c_blue = 2;
    public static final int c_green = 3;
    public static final int c_violet = 4;
    //Конец блока констант
    //Блок констант с id карт начало
    public static final int c_weath_field = 1;
    public static final int c_bakery = 2;
    public static final int c_cafe = 3;
    public static final int c_stadium = 4;
    public static final int c_susi_bar = 5;
    public static final int c_farm = 6;
    public static final int c_corn_field = 7;
    public static final int c_flowers = 8;
    public static final int c_grapes = 9;
    public static final int c_forest = 10;
    public static final int c_mine = 11;
    public static final int c_fisher = 12;
    public static final int c_trawler = 13;
    public static final int c_littleshop = 14;
    public static final int c_bigshop = 15;
    public static final int c_busters = 16;
    public static final int c_bank = 17;
    public static final int c_flower_shop = 18;
    public static final int c_cheese_factory = 19;
    public static final int c_furniture_factory = 20;
    public static final int c_vine_factory = 21;
    public static final int c_garden = 22;

    //Конец блока констант id карт
    @NotNull
    @Column(name = "CARDID")
    protected Integer cardid;

    @Column(name = "VALUE_")
    protected Integer value = 0;

    @Column(name = "WORKING")
    protected Boolean working = true;

    @Column(name = "COLOR_ID")
    protected Integer colorId;

    @Column(name = "SYMBOL")
    protected Integer symbol;

    public void changeowner (Player newowner) {
        this.owner=newowner;
    }


    public Boolean Condition()

    {
        return (this.working & this.CheckTriggers(this.owner.game.score));
    }
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OWNER_ID")
    protected Player owner;
    @Column(name = "ICON", length = 4000)
    protected String icon;

    @NotNull
    @Column(name = "NAME", unique = true)
    protected String name;

    @NotNull
    @Column(name = "COST")
    protected Integer cost;

    @NotNull
    @Column(name = "TRIGGERS")
    protected byte[] triggers;

    public void setWorking(Boolean working) {
        this.working = working;
    }
    public boolean CheckTriggers(int value)
    {
        for (int x=0;x<this.triggers.length;x++)
        {
            if (this.triggers[0] == value) return true;
        }
        return false;
    }

    public Boolean getWorking() {
        return working;
    }


    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }


    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getColorId() {
        return colorId;
    }


    public void play()
    {
        if (this.Condition()) {this.effect();}
    }
    public void effect ()
    {
        this.working=true;
    }
    public void setSymbol(Integer symbol) {
        this.symbol = symbol;
    }

    public Integer getSymbol() {
        return symbol;
    }


    public String getIcon() {
        return icon;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }
    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Integer getCardid() {
        return cardid;
    }



    public String getName() {
        return name;
    }


    public Integer getCost() {
        return cost;
    }

    public byte[] getTriggers() {
        return triggers;
    }


}