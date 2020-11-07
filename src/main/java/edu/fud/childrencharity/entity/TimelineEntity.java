package edu.fud.childrencharity.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "timeline", schema = "sql2366886", catalog = "")
public class TimelineEntity {
    private int id;
    private Integer eventId;
    private String description;
    private String image;
    private Timestamp createdAt;
    private EventEntity eventByEventId;

    @Id
    @Column(name = "id",insertable = false,updatable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "event_id",insertable = false,updatable = false)
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "description",insertable = false,updatable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "image",insertable = false,updatable = false)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "created_at",insertable = false,updatable = false)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimelineEntity that = (TimelineEntity) o;
        return id == that.id &&
                Objects.equals(eventId, that.eventId) &&
                Objects.equals(description, that.description) &&
                Objects.equals(image, that.image) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventId, description, image, createdAt);
    }

    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    public EventEntity getEventByEventId() {
        return eventByEventId;
    }

    public void setEventByEventId(EventEntity eventByEventId) {
        this.eventByEventId = eventByEventId;
    }
}
