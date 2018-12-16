package com.company.machikoro.entity;

import javax.persistence.Entity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.MappedSuperclass;

@Entity(name = "machikoro$BlueCard")
@NamePattern("%s|name")
public class BlueCard extends Card {
    private static final long serialVersionUID = -6921073494226150075L;
    protected Integer colorId = c_blue;
    }