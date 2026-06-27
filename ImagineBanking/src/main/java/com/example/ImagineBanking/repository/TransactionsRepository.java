package com.example.ImagineBanking.repository;

import com.example.ImagineBanking.Domain.Transactions;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionsRepository extends CrudRepository<Transactions,Long>  {
    @Query("SELECT p FROM Transactions p WHERE p.userID = ?1")
    List<Transactions> search(Long userID);
}
