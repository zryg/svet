package com.bgrulers.entity.ruler;

import com.bgrulers.entity.Dynasty;
import com.bgrulers.entity.JpaEntity;
import com.bgrulers.entity.Title;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Ruler extends JpaEntity {

    @NotNull
	private String name;

    @ManyToOne
    private Title title;

    private String extraTitle;

    @Temporal(TIMESTAMP)
    private Date reignStart;

    @Temporal(TIMESTAMP)
    private Date reignEnd;

    @Column(length = 15000)
    private String information;

    @ManyToOne
    private Dynasty dynasty;

    public String getName() {
        return name;
    }
	
    public void setName(String name) {
        this.name = name;
    }
	
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Date getReignStart() {
        return reignStart;
    }

    public void setReignStart(Date reignStart) {
        this.reignStart = reignStart;
    }

    public Date getReignEnd() {
        return reignEnd;
    }

    public void setReignEnd(Date reignEnd) {
        this.reignEnd = reignEnd;
    }

    public Dynasty getDynasty() {
        return dynasty;
    }

    public void setDynasty(Dynasty dynasty) {
        this.dynasty = dynasty;
    }

    public String getExtraTitle() {
        return extraTitle;
    }

    public void setExtraTitle(String extraTitle) {
        this.extraTitle = extraTitle;
    }
}
