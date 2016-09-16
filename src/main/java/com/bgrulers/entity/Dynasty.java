package com.bgrulers.entity;

import com.bgrulers.entity.ruler.Ruler;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created by sslavkov on 5/30/2016.
 */

@Entity
public class Dynasty extends JpaEntity {
	
	private String name;
    @Column(length = 15000)
	private String description;

    //one to many with rulers
    @OneToMany
    private Collection<Ruler> rulers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Ruler> getRulers() {
        return rulers;
    }

    public void setRulers(Collection<Ruler> rulers) {
        this.rulers = rulers;
    }
}
