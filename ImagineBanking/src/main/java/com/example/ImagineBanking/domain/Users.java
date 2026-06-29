package com.example.ImagineBanking.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private Date birthDate;
    private String street;
    private String city;
    private String stateAbbr;
    private int zipCode;
    private String email;
    private String phoneNumber;
    private boolean isChecking;
    private boolean isSaving;
    private String username;

    private String password;


    public Users() {
        middleInitial = ' ';
    }

    public Users(Long Id, String firstName, String lastName) {
        this.Id = Id;
        this.firstName = firstName;
        middleInitial = ' ';
        this.lastName = lastName;
    }

    public Users(Long Id, String firstName, String lastName, String street, String city, String stateAbbr, int zipCode) {
        this.Id = Id;
        this.firstName = firstName;
        middleInitial = ' ';
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.stateAbbr = stateAbbr;
        this.zipCode = zipCode;
    }
    public Users(Long id, String firstName, char middleInitial, String lastName, Date birthDate, String street, String city, String stateAbbr, int zipCode, String email, String phoneNumber, boolean isChecking, boolean isSaving, String username, String password) {
        Id = id;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.street = street;
        this.city = city;
        this.stateAbbr = stateAbbr;
        this.zipCode = zipCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isChecking = isChecking;
        this.isSaving = isSaving;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public boolean isChecking() {
        return isChecking;
    }

    public void setChecking(boolean checking) {
        isChecking = checking;
    }

    public boolean isSaving() {
        return isSaving;
    }

    public void setSaving(boolean saving) {
        isSaving = saving;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}