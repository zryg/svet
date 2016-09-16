package com.bgrulers.entity;

import com.bgrulers.enums.TitleType;

import javax.persistence.*;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Title extends JpaEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "title_type", unique = true)
	private TitleType titleType;
    @Column(length = 15000)
	private String description;
	

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TitleType getTitleType() {
        return titleType;
    }

    public void setTitleType(TitleType titleType) {
        this.titleType = titleType;
    }
}
