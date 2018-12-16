package com.company.machikoro.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|name")
@Table(name = "MACHIKORO_PLAYER")
@Entity(name = "machikoro$Player")
public class Player extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 5143672437960836234L;
    private static final int c_TradeBonus = 1;
    @NotNull
    @Column(name = "PLAYERID")
    protected Integer playerid;

    @Column(name = "BUILT")
    protected Boolean built;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GAME_ID")
    protected Game game;

    @OrderBy
    @OneToMany(mappedBy = "owner")
    protected List<Card> cards;
    @NotNull
    @Column(name = "NAME", length = 4000)
    protected String name;

    @Column(name = "MONEY")
    protected Integer money = 3;

    @Column(name = "PORT")
    protected Boolean port;

    @Column(name = "TERMINUS")
    protected Boolean terminus;

    @Column(name = "TC")
    protected Boolean tc;

    @Column(name = "DISNEY")
    protected Boolean disney;

    @Column(name = "RADIO")
    protected Boolean radio;

    @Column(name = "AIRPORT")
    protected Boolean airport;

    public void setAirport(Boolean airport) {
        this.airport = airport;
    }

    public Boolean getAirport() {
        return airport;
    }


    public int TradeBonus ()
    {
        if (this.tc) return c_TradeBonus;
        else return 0;
    }
    public int BigCount() {
        //Посчитаем достопримечательности
        int count = 0;
        if (this.tc) count++;
        if (this.airport) count++;
        if (this.terminus) count++;
        if (this.radio) count++;
        if (this.port) count++;
        if (this.disney) count++;
        return count;
    }
    public void addCard ()
    {
 int i=1;
    }
    Player (String name,int id)
    {
    this.name = name;
    this.id = id;


    }
    public void setRadio(Boolean radio) {
        this.radio = radio;
    }

    public Boolean getRadio() {
        return radio;
    }


    public void setDisney(Boolean disney) {
        this.disney = disney;
    }

    public Boolean getDisney() {
        return disney;
    }


    public void setTc(Boolean tc) {
        this.tc = tc;
    }

    public Boolean getTc() {
        return tc;
    }


    public void setTerminus(Boolean terminus) {
        this.terminus = terminus;
    }

    public Boolean getTerminus() {
        return terminus;
    }


    public void setPort(Boolean port) {
        this.port = port;
    }

    public Boolean getPort() {
        return port;
    }


    public void setBuilt(Boolean built) {
        this.built = built;
    }

    public Boolean getBuilt() {
        return built;
    }


    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }


    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    //Получить value денег ИЗ Банка
    public void addMoney (int value)
    {
        this.money+=value;
    }
    //Отдать value денег В Банка
    public void loseMoney (int value)

    {   if (this.money<value) value = this.money;
        this.money-=value;
    }
    //Забрать value денег у переданного игрока, если у него их достаточно
    //если нет - то забрать все
    //реализовано через методы addMoney и loseMoney
    public void steal (int value, Player victim)
    {
        if (victim.getMoney()<value) { value = victim.getMoney(); }
       victim.loseMoney(value);
       this.addMoney(value);

    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setPlayerid(Integer playerid) {
        this.playerid = playerid;
    }

    public Integer getPlayerid() {
        return playerid;
    }


}