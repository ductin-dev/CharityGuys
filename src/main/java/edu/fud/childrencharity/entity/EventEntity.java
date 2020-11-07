package edu.fud.childrencharity.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "event", schema = "sql2366886", catalog = "")
public class EventEntity {
    private int id;
    private Integer hostGroupId;
    private String name;
    private String description;
    private String location;
    private Boolean pubblic;
    private Timestamp createdAt;
    private Collection<DonationEntity> donationsById;
    private GroupEntity groupByHostGroupId;
    private Collection<EventMemberEntity> eventMembersById;
    private Collection<TimelineEntity> timelinesById;

    @Id
    @Column(name = "id",insertable = false,updatable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "host_group_id",insertable = false,updatable = false)
    public Integer getHostGroupId() {
        return hostGroupId;
    }

    public void setHostGroupId(Integer hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    @Basic
    @Column(name = "name",insertable = false,updatable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "location",insertable = false,updatable = false)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "pubblic",insertable = false,updatable = false)
    public Boolean getPubblic() {
        return pubblic;
    }

    public void setPubblic(Boolean pubblic) {
        this.pubblic = pubblic;
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
        EventEntity that = (EventEntity) o;
        return id == that.id &&
                Objects.equals(hostGroupId, that.hostGroupId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(location, that.location) &&
                Objects.equals(pubblic, that.pubblic) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hostGroupId, name, description, location, pubblic, createdAt);
    }

    @OneToMany(mappedBy = "eventByEventId")
    public Collection<DonationEntity> getDonationsById() {
        return donationsById;
    }

    public void setDonationsById(Collection<DonationEntity> donationsById) {
        this.donationsById = donationsById;
    }

    @ManyToOne
    @JoinColumn(name = "host_group_id", referencedColumnName = "id")
    public GroupEntity getGroupByHostGroupId() {
        return groupByHostGroupId;
    }

    public void setGroupByHostGroupId(GroupEntity groupByHostGroupId) {
        this.groupByHostGroupId = groupByHostGroupId;
    }

    @OneToMany(mappedBy = "eventByEventId")
    public Collection<EventMemberEntity> getEventMembersById() {
        return eventMembersById;
    }

    public void setEventMembersById(Collection<EventMemberEntity> eventMembersById) {
        this.eventMembersById = eventMembersById;
    }

    @OneToMany(mappedBy = "eventByEventId")
    public Collection<TimelineEntity> getTimelinesById() {
        return timelinesById;
    }

    public void setTimelinesById(Collection<TimelineEntity> timelinesById) {
        this.timelinesById = timelinesById;
    }
}
