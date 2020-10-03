package edu.fud.childrencharity.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "sql2366886", catalog = "")
public class UserEntity {
    private int id;
    private String fullname;
    private String email;
    private String username;
    private String passwordHash;
    private String phoneNumber;
    private String contact;
    private String avatar;
    private Timestamp createdAt;
    private Collection<DonationEntity> donationsById;
    private Collection<EventMemberEntity> eventMembersById;
    private Collection<GroupMemberEntity> groupMembersById;
    private Collection<NotificationEntity> notificationsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fullname")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password_hash")
    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "created_at")
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
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(fullname, that.fullname) &&
                Objects.equals(email, that.email) &&
                Objects.equals(username, that.username) &&
                Objects.equals(passwordHash, that.passwordHash) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(contact, that.contact) &&
                Objects.equals(avatar, that.avatar) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, email, username, passwordHash, phoneNumber, contact, avatar, createdAt);
    }

    @OneToMany(mappedBy = "userByDornor")
    public Collection<DonationEntity> getDonationsById() {
        return donationsById;
    }

    public void setDonationsById(Collection<DonationEntity> donationsById) {
        this.donationsById = donationsById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<EventMemberEntity> getEventMembersById() {
        return eventMembersById;
    }

    public void setEventMembersById(Collection<EventMemberEntity> eventMembersById) {
        this.eventMembersById = eventMembersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<GroupMemberEntity> getGroupMembersById() {
        return groupMembersById;
    }

    public void setGroupMembersById(Collection<GroupMemberEntity> groupMembersById) {
        this.groupMembersById = groupMembersById;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<NotificationEntity> getNotificationsById() {
        return notificationsById;
    }

    public void setNotificationsById(Collection<NotificationEntity> notificationsById) {
        this.notificationsById = notificationsById;
    }
}
