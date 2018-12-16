package com.company.machikoro.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import javax.persistence.Column;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.chile.core.annotations.Composition;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Table(name = "MACHIKORO_GAME")
@Entity(name = "machikoro$Game")
public class Game extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -3733385732592087796L;
    @Column(name = "GAME_ID")
    protected Integer gameId;

    @Column(name = "TRAWLER")
    protected Integer trawler;

    @Column(name = "BONUS")
    protected Boolean bonus;

    @Column(name = "SCORE")
    protected Integer score;

    @OneToMany(mappedBy = "game")
    protected List<Player> players;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENT_PLAYER_ID")
    protected Player currentPlayer;
    //Пока реализуем методы без привязки в UI
    public void setTrawler(Integer trawler) {
        this.trawler = trawler;
    }

    public Integer getTrawler() {
        return trawler;
    }
    public void ChooseBig(Player player)
    {
        //Покажем окно выбора достопримечательности
        player.port=false;
    }

    public Player ChosePlayer()
    {
        //Тут UI Диалог
        return this.currentPlayer;
    }
    public Card ChoseCard(Player owner)
    {
        //И тут UI
        return owner.cards.get(0);
    }
    public Card createCard(int id)
    {
        Card out = new Card();
        switch (id) {
            case Card.c_weath_field:
                out = new WeathField(this.currentPlayer);
            break;
            case Card.c_bakery:
                out = new Bakery(this.currentPlayer);
                break;
            default:
                break;
        }
    return out;
    }
    public void newRound()
    {
        this.currentPlayer = NextPlayer();
        this.currentPlayer.built = false;
    }
    public void endturn ()
    {
        if ((this.currentPlayer.airport) & (this.currentPlayer.built==false))
        {
            this.currentPlayer.addMoney(10);
        }
    }
    //Основной метод для обсчета хода
    //Тут будут провертся карты всех игроков + реролл и прочее
    public void play()
    {

    }
    public Player NextPlayer()
            //Если был выброшен дубль и нужен бонус раунд - то следующий игрок=текущий
    {   if (this.bonus) {return this.currentPlayer;}
    //Иначе - получаем следующего ходя по кругу
        if (this.players.iterator().hasNext())
        { return this.players.iterator().next();}
        else return this.players.get(0);
    }
    public void SetPlayer()
    {
        if (this.currentPlayer == null)
        {
            this.currentPlayer=NextPlayer();
        }
    }

    public void setBonus(Boolean bonus) {
        this.bonus = bonus;
    }

    public Boolean getBonus() {
        return bonus;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }




    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }




    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getGameId() {
        return gameId;
    }


}