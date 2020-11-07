package edu.fud.childrencharity.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "donation", schema = "sql2366886", catalog = "")
public class DonationEntity {
    private int id;
    private String type;
    private int amount;
    private Integer dornor;
    private String donorDescription;
    private Integer eventId;
    private Timestamp createdAt;
    private UserEntity userByDornor;
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
    @Column(name = "type",insertable = false,updatable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "amount",insertable = false,updatable = false)
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "dornor",insertable = false,updatable = false)
    public Integer getDornor() {
        return dornor;
    }

    public void setDornor(Integer dornor) {
        this.dornor = dornor;
    }

    @Basic
    @Column(name = "donor_description",insertable = false,updatable = false)
    public String getDonorDescription() {
        return donorDescription;
    }

    public void setDonorDescription(String donorDescription) {
        this.donorDescription = donorDescription;
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
        DonationEntity that = (DonationEntity) o;
        return id == that.id &&
                amount == that.amount &&
                Objects.equals(type, that.type) &&
                Objects.equals(dornor, that.dornor) &&
                Objects.equals(donorDescription, that.donorDescription) &&
                Objects.equals(eventId, that.eventId) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, amount, dornor, donorDescription, eventId, createdAt);
    }

    @ManyToOne
    @JoinColumn(name = "dornor", referencedColumnName = "id")
    public UserEntity getUserByDornor() {
        return userByDornor;
    }

    public void setUserByDornor(UserEntity userByDornor) {
        this.userByDornor = userByDornor;
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
