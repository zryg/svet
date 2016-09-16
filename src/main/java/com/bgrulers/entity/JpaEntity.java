package com.bgrulers.entity;

import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

/**
 * Created by sslavkov on 5/30/2016.
 */
@MappedSuperclass
public class JpaEntity implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version", nullable = false)
    private Integer version;

    @Temporal(TIMESTAMP)
    @Column(name = "created")
    private Date created;

    @Temporal(TIMESTAMP)
    @Column(name = "updated")
    private Date updated;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(final Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(final Date updated) {
        this.updated = updated;
    }

    @PrePersist
    protected void onCreate() {
        created = new Date();
        updated = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updated = new Date();
    }

    @Override
    public boolean isNew() {
        return getId() == null || getId() == 0;
    }
}
