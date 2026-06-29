package com.example.ImagineBanking.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersTest {
    Users user;

    @BeforeEach
    void setUser() {
        user = new Users();
    }

    @Test
    void setId() {
        Long id = 6L;
        user.setId(id);
        assertEquals(id, user.getId());
    }

    @Test
    void getId() {
        Long id = 6L;
        user.setId(id);
        assertEquals(id, user.getId());
    }

    @Test
    void setFirstName() {
        String firstName = "Jane";
        user.setFirstName(firstName);
        assertEquals(firstName, user.getFirstName());
    }

    @Test
    void getFirstName() {
        String firstName = "Jane";
        user.setFirstName(firstName);
        assertEquals(firstName, user.getFirstName());
    }

    @Test
    void setLastName() {
        String lastName = "Doe";
        user.setLastName(lastName);
        assertEquals(lastName, user.getLastName());
    }

    @Test
    void getLastName() {
        String lastName = "Doe";
        user.setLastName(lastName);
        assertEquals(lastName, user.getLastName());
    }

    @Test
    void setStreetAddress() {
        String streetAddress = "123 Sesame Street";
        user.setStreet(streetAddress);
        assertEquals(streetAddress, user.getStreet());
    }

    @Test
    void getStreetAddress() {
        String streetAddress = "123 Sesame Street";
        user.setStreet(streetAddress);
        assertEquals(streetAddress, user.getStreet());
    }

    @Test
    void setCityAddress() {
        String city = "Chicago";
        user.setCity(city);
        assertEquals(city, user.getCity());
    }

    @Test
    void getCityAddress() {
        String city = "Chicago";
        user.setCity(city);
        assertEquals(city, user.getCity());
    }

    @Test
    void setStateAbbr() {
        String stateAbbr = "IN";
        user.setStateAbbr(stateAbbr);
        assertEquals(stateAbbr, user.getStateAbbr());
    }

    @Test
    void getStateAbbr() {
        String stateAbbr = "IN";
        user.setStateAbbr(stateAbbr);
        assertEquals(stateAbbr, user.getStateAbbr());
    }

    @Test
    void setZipCode() {
        int zipCode = 12345;
        user.setZipCode(zipCode);
        assertEquals(zipCode, user.getZipCode());
    }

    @Test
    void getZipCode() {
        int zipCode = 12345;
        user.setZipCode(zipCode);
        assertEquals(zipCode, user.getZipCode());
    }

    @Test
    void toStringTest() {
        String firstName = "John";
        user.setFirstName(firstName);

        String lastName = "Doe";
        user.setLastName(lastName);

        String toString = "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

        assertEquals(toString, user.toString());
    }
}
