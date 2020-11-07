package edu.fud.childrencharity.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "group_member", schema = "sql2366886", catalog = "")
public class GroupMemberEntity {
    private int id;
    private Integer userId;
    private Integer groupId;
    private Integer role;
    private Integer requestStatus;
    private UserEntity userByUserId;
    private GroupEntity groupByGroupId;
    private RoleEntity roleByRole;

    @Id
    @Column(name = "id",insertable = false,updatable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id",insertable = false,updatable = false)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "group_id",insertable = false,updatable = false)
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "role",insertable = false,updatable = false)
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Basic
    @Column(name = "request_status",insertable = false,updatable = false)
    public Integer getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Integer requestStatus) {
        this.requestStatus = requestStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupMemberEntity that = (GroupMemberEntity) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(role, that.role) &&
                Objects.equals(requestStatus, that.requestStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, groupId, role, requestStatus);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    public GroupEntity getGroupByGroupId() {
        return groupByGroupId;
    }

    public void setGroupByGroupId(GroupEntity groupByGroupId) {
        this.groupByGroupId = groupByGroupId;
    }

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    public RoleEntity getRoleByRole() {
        return roleByRole;
    }

    public void setRoleByRole(RoleEntity roleByRole) {
        this.roleByRole = roleByRole;
    }
}
