package com.github.fcandiotti.pesquisamovie.entities;

import java.io.Serializable;
import java.time.Instant;

public class Record implements Serializable {

    private Long id;
    private String name;
    private Integer ege;
    private Instant moment;

    private Game game;

    public Record() {
    }

    public Record(Long id, String name, Integer ege, Instant moment, Game game) {
        this.id = id;
        this.name = name;
        this.ege = ege;
        this.moment = moment;
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEge() {
        return ege;
    }

    public void setEge(Integer ege) {
        this.ege = ege;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (((id == null)) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Record record = (Record) obj;
        if (id == null) {
            if (record.id != null)
                return false;
        } else if (!id.equals(record.id))
            return false;
        return true;
    }
}
