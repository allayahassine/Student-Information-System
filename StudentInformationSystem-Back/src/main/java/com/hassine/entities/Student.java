package com.hassine.entities;

import com.hassine.enumerations.Gender;
import com.hassine.enumerations.Nationality;
import com.hassine.enumerations.StudentStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String nationalIdentityCard;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private int phoneNumber;
    private String email;
    private boolean createLogin;

    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(length = 100000)
    private byte[] picture;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Nationality nationality;

    private int repeatingYears;
    private int controlSessions;

    @Enumerated(EnumType.STRING)
    private StudentStatus status;

    public Student() {
    }

    public Student(String firstName, String lastName, String nationalIdentityCard, Date dateOfBirth, int phoneNumber, String email, boolean createLogin, byte[] picture, Gender gender, Nationality nationality, int repeatingYears, int controlSessions, StudentStatus status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentityCard = nationalIdentityCard;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createLogin = createLogin;
        this.picture = picture;
        this.gender = gender;
        this.nationality = nationality;
        this.repeatingYears = repeatingYears;
        this.controlSessions = controlSessions;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentityCard() {
        return nationalIdentityCard;
    }

    public void setNationalIdentityCard(String nationalIdentityCard) {
        this.nationalIdentityCard = nationalIdentityCard;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCreateLogin() {
        return createLogin;
    }

    public void setCreateLogin(boolean createLogin) {
        this.createLogin = createLogin;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public int getRepeatingYears() {
        return repeatingYears;
    }

    public void setRepeatingYears(int repeatingYears) {
        this.repeatingYears = repeatingYears;
    }

    public int getControlSessions() {
        return controlSessions;
    }

    public void setControlSessions(int controlSessions) {
        this.controlSessions = controlSessions;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }
}
