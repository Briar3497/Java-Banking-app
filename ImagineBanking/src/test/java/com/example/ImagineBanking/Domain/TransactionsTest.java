package com.example.ImagineBanking.Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionsTest {

    Transactions transaction;

    @BeforeEach
    void setTransaction() {
        transaction = new Transactions();
    }

    @Test
    void getId() {
        Long id = 6L;
        transaction.setId(id);
        assertEquals(id, transaction.getId());
    }

    @Test
    void setId() {
        Long id = 6L;
        transaction.setId(id);
        assertEquals(id, transaction.getId());
    }

    @Test
    void getUserID() {
        Long id = 6L;
        transaction.setUserID(id);
        assertEquals(id, transaction.getUserID());
    }

    @Test
    void setUserID() {
        Long id = 6L;
        transaction.setUserID(id);
        assertEquals(id, transaction.getUserID());
    }

    @Test
    void getDescription() {
        String description = "Walmart - SouthBend";
        transaction.setDescription(description);
        assertEquals(description, transaction.getDescription());
    }

    @Test
    void setDescription() {
        String description = "Walmart - SouthBend";
        transaction.setDescription(description);
        assertEquals(description, transaction.getDescription());
    }

    @Test
    void getDate() {
        String date = "06/26/2026";
        transaction.setDate(date);
        assertEquals(date, transaction.getDate());
    }

    @Test
    void setDate() {
        String date = "06/26/2026";
        transaction.setDate(date);
        assertEquals(date, transaction.getDate());
    }

    @Test
    void getTime() {
        String time = "4:16 PM";
        transaction.setTime(time);
        assertEquals(time, transaction.getTime());
    }

    @Test
    void setTime() {
        String time = "4:16 PM";
        transaction.setTime(time);
        assertEquals(time, transaction.getTime());
    }

    @Test
    void testToString() {
    }
}