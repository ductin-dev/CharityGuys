package edu.fud.childrencharity.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "role", schema = "sql2366886", catalog = "")
public class RoleEntity {
    private int id;
    private String name;
    private Collection<EventMemberEntity> eventMembersById;
    private Collection<GroupMemberEntity> groupMembersById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @OneToMany(mappedBy = "roleByRole")
    public Collection<EventMemberEntity> getEventMembersById() {
        return eventMembersById;
    }

    public void setEventMembersById(Collection<EventMemberEntity> eventMembersById) {
        this.eventMembersById = eventMembersById;
    }

    @OneToMany(mappedBy = "roleByRole")
    public Collection<GroupMemberEntity> getGroupMembersById() {
        return groupMembersById;
    }

    public void setGroupMembersById(Collection<GroupMemberEntity> groupMembersById) {
        this.groupMembersById = groupMembersById;
    }
}
